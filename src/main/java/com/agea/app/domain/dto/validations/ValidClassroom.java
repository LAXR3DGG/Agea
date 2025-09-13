package com.agea.app.domain.dto.validations;

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

@NotNull(message = "Classroom must be provided")
@NotBlank(message = "Classroom cannot be blank")
@Pattern(regexp = "^\\d-\\d{2}", message = "Classroom must be like '2-32'")
public @interface ValidClassroom {
    String message() default "Invalid classroom";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
