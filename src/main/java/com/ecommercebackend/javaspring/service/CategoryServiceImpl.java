package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.CategoryResponseDto;
import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.repository.CategoryRepository;
import com.ecommercebackend.javaspring.util.CategoryDtoConvertion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponseDto> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        return CategoryDtoConvertion.convertCategoryList(categories);
    }

    @Override
    public CategoryResponseDto getCategoriesByID(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);

        if (optionalCategory.isPresent()){
            return CategoryDtoConvertion.convertCategory(optionalCategory.get());
        }
        //TODO Eger eslesen id olmazsa Exception firlat.
        throw new RuntimeException("Eslesen id bulunamadi.");
    }

    @Override
    public CategoryResponseDto addCategory(Category category) {
         categoryRepository.save(category);
         return CategoryDtoConvertion.convertCategory(category);
    }

    @Override
    public CategoryResponseDto updateCategory(Category category , Long id) {

        return null;

        //TODO Guncelleme yapacak logic i yaz.
    }

    @Override
    public CategoryResponseDto deleteCategoryByID(Long id) {
        Optional<Category> optional = categoryRepository.findById(id);
        if (!optional.isPresent()){
            throw new RuntimeException("id yok");
        }
        categoryRepository.delete(optional.get());
        return CategoryDtoConvertion.convertCategory(optional.get());
    }

    @Override
    public Category getCategory(Long id) {
            Optional<Category> optional = categoryRepository.findById(id);
            if (optional.isPresent()){
                return optional.get();
            }
            throw new RuntimeException("Girilen id li category yok.");
    }
}
