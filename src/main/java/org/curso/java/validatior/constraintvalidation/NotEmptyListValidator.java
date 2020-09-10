package org.curso.java.validatior.constraintvalidation;

import org.curso.java.validatior.NotEmpyList;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyListValidator implements ConstraintValidator<NotEmpyList, List> {

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list != null && !list.isEmpty();
    }

    @Override
    public void initialize(NotEmpyList constraintAnnotation) {
    }
}
