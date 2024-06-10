package com.example.MaiTheNghia_QLSach_Tuan3.validator;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.User;
import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid (User user, ConstraintValidatorContext context) {

        if (user == null)
            return true;
        return user.getId() != null;
    }
}
