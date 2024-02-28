package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.dto.CategoryResponseDto;
import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public List<CategoryResponseDto> findAll(){
        return categoryService.getCategories();
    }

    @GetMapping("/{id}")
    public CategoryResponseDto getCategoryByID(@PathVariable Long id){
        return categoryService.getCategoriesByID(id);
    }

    @PostMapping("/")
    public CategoryResponseDto saveCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @PutMapping("/category/{id}")
    public CategoryResponseDto updateCategory(@RequestBody Category category , @PathVariable Long id){

        return categoryService.updateCategory(category,id);
    }

    @DeleteMapping("/category/{id}")
    public CategoryResponseDto deleteCategory(Long id){
        return categoryService.deleteCategoryByID(id);
    }
}
