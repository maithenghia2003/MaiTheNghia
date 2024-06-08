package com.example.MaiTheNghia_QLSach_Tuan3.validator;

import com.example.MaiTheNghia_QLSach_Tuan3.enity.Category;
import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return  category != null && category.getId() != null;
    }
}
