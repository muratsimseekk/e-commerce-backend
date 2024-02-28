package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.CategoryResponseDto;
import com.ecommercebackend.javaspring.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<CategoryResponseDto> getCategories();
    CategoryResponseDto getCategoriesByID(Long id);
    CategoryResponseDto addCategory(Category category);
    CategoryResponseDto updateCategory(Category category , Long id);
    CategoryResponseDto deleteCategoryByID(Long id);
}
