package com.example.MaiTheNghia_QLSach_Tuan3.services;


import com.example.MaiTheNghia_QLSach_Tuan3.enity.Category;
import com.example.MaiTheNghia_QLSach_Tuan3.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
            categoryRepository.deleteById(id);
        }
}
