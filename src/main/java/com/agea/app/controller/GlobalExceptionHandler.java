package com.agea.app.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
            value = MethodArgumentNotValidException.class,
            produces = APPLICATION_JSON_VALUE
    )
    public ProblemDetail onRequestValidationError(MethodArgumentNotValidException e) {
        // Get all field errors in key-value pairs
        Map<String, String> errors = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach(error -> {
            String field = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(field, message);
        });

        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle("Validation failed");
        problemDetail.setDetail("One or more fields have invalid values");
        problemDetail.setProperty("errors", errors);

        return problemDetail;
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
            value = HttpMessageNotReadableException.class,
            produces = APPLICATION_JSON_VALUE
    )
    public ProblemDetail onBadEnumValueFromRequest(HttpMessageNotReadableException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle("Invalid value in request");

        // Extracting the useful info from the exception
        Throwable cause = e.getCause();
        if (cause instanceof InvalidFormatException invalidFormatException) {
            Class<?> target = invalidFormatException.getTargetType();
            if (target.isEnum()) {
                String invalidValue = invalidFormatException.getValue().toString();
                String[] validValues = Arrays.stream(target.getEnumConstants())
                        .map(Object::toString)
                        .toArray(String[]::new);

                problemDetail.setDetail("Invalid value "+invalidValue+" for enum type "+target.getSimpleName());
                problemDetail.setProperty("validValues", validValues);

            } else { // In case the error was not from an enum
                problemDetail.setDetail(e.getMostSpecificCause().getMessage());
            }
        }

        return problemDetail;
    }



    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(
            value = NoResourceFoundException.class,
            produces = APPLICATION_JSON_VALUE
    )
    public ProblemDetail onNoResourceFound(NoResourceFoundException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problemDetail.setTitle("Resource not found");
        problemDetail.setDetail("There was no defined endpoint for the requested URI");
        return problemDetail;
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
            value = MethodArgumentTypeMismatchException.class,
            produces = APPLICATION_JSON_VALUE
    )
    public ProblemDetail onMethodArgumentTypeMismatch(MethodArgumentTypeMismatchException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle("Argument type mismatch");

        String param = e.getName();
        Object invalidValue = e.getValue();
        String validType = (e.getRequiredType() != null) ? e.getRequiredType().getSimpleName() : "Unknow";

        problemDetail.setDetail("Parameter "+param+" with value "+invalidValue+" cannot be converted to "+validType);
        problemDetail.setProperty("expectedType", validType);

        return problemDetail;
    }
}
