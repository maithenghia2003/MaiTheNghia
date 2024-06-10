package com.example.MaiTheNghia_QLSach_Tuan3.validator;
 import com.example.MaiTheNghia_QLSach_Tuan3.repository.IuserRepository;
import com.example.MaiTheNghia_QLSach_Tuan3.enity.Category;
import com.example.MaiTheNghia_QLSach_Tuan3.enity.User;

 import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidCategoryId;
import com.example.MaiTheNghia_QLSach_Tuan3.validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IuserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}