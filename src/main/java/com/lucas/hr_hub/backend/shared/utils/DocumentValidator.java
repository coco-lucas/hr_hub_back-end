package com.lucas.hr_hub.backend.shared.utils;

import org.hibernate.validator.internal.constraintvalidators.hv.br.CNPJValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;

import com.lucas.hr_hub.backend.Employee.enums.DocumentTypeEnum;
import com.lucas.hr_hub.backend.user.User;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DocumentValidator implements ConstraintValidator<ValidDocument, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintContext) {
        String documentNum = user.getDocumentNum().replaceAll("\\D", "");
        DocumentTypeEnum type = user.getDocumentType();

        if (type == DocumentTypeEnum.CPF) {
            CPFValidator cpfValidator = new CPFValidator();
            cpfValidator.initialize(null);
            return cpfValidator.isValid(documentNum, constraintContext);
        } else if (type == DocumentTypeEnum.CNPJ) {
            CNPJValidator cnpjValidator = new CNPJValidator();
            cnpjValidator.initialize(null);
            return cnpjValidator.isValid(documentNum, constraintContext);
        }
        return false;
    }
}
