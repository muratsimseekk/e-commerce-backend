package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> getCategories();
    Category getCategoriesByID(Long id);
    Category addCategory(Category category);
    Category updateCategory(Category category , Long id);
    Category deleteCategoryByID(Long id);
}
