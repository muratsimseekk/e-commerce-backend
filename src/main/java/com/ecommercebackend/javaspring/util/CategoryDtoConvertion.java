package com.ecommercebackend.javaspring.util;

import com.ecommercebackend.javaspring.dto.CategoryResponseDto;
import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDtoConvertion {

    public static List<CategoryResponseDto> convertCategoryList(List<Category> categories){
        List<CategoryResponseDto> categoryResponses = new ArrayList<>();

        categories.stream().forEach(category -> categoryResponses.add(new CategoryResponseDto(category.getId(),category.getCode(),
                category.getGender(),category.getImg(),category.getRating(),category.getTitle())));
        return categoryResponses;
    }

    public static CategoryResponseDto convertCategory(Category category){
        return new CategoryResponseDto(category.getId(),category.getCode(),
                category.getGender(),category.getImg(),category.getRating(),category.getTitle());
    }

}
