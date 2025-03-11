package com.lucas.hr_hub.backend.Utils;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;

/**
 * Validates the Document Num based on the DocumentType chossen.
 * 
 * Created using the jakarta.validation properties, including its CPF & CNPJ validators.
 */

@ReportAsSingleViolation
@Documented
@Constraint(validatedBy = DocumentValidator.class)
@Target({ ANNOTATION_TYPE, FIELD, METHOD, PARAMETER })
@Retention(RUNTIME)
public @interface ValidDocument {
    
    String message() default "The document number is invalid for chossen the document type";
    
    Class<?>[] groups() default{};
    
    Class<? extends Payload>[] payload() default {};
}