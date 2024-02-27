package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> findAll(){
        return categoryService.getCategories();
    }

    @GetMapping("/category/{id}")
    public Category getCategoryByID(@PathVariable Long id){
        return categoryService.getCategoriesByID(id);
    }

    @PostMapping("/category")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @PutMapping("/category/{id}")
    public Category updateCategory(@RequestBody Category category , @PathVariable Long id){

        return categoryService.updateCategory(category,id);
    }
}
