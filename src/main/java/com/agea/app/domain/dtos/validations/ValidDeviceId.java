package com.agea.app.domain.dtos.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {})
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)

@NotNull(message = "Device ID must be provided")
@Min(value = 0, message = "Device ID cannot be negative")
public @interface ValidDeviceId {
    String message() default "Invalid device ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


