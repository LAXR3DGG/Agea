package com.agea.app.domain.dto.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {})
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)

@NotNull(message = "User ID must be provided")
@NotBlank(message = "User ID cannot be blank")
@Size(min = 3, max = 20, message = "User id must be 3-20 characters long")
@Pattern(regexp = "^\\d+$", message = "ID must be matrícula or control number")
public @interface ValidUserId {
    String message() default "Invalid user ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
