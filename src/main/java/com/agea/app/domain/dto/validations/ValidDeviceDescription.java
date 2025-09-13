package com.agea.app.domain.dto.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = {})
@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)

@NotNull(message = "Device description must be provided")
@NotBlank(message = "Device description cannot be blank")
@Size(min = 5, max = 50, message = "Device description must be 5-50 characters long")
public @interface ValidDeviceDescription {
    String message() default "Invalid device description";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
