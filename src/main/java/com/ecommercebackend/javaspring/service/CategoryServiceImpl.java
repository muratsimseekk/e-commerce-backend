package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.repository.CategoryRepository;
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
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoriesByID(Long id) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);

        if (optionalCategory.isPresent()){
            return optionalCategory.get();
        }
        //TODO Eger eslesen id olmazsa Exception firlat.
        throw new RuntimeException("Eslesen id bulunamadi.");
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category , Long id) {

        return null;

        //TODO Guncelleme yapacak logic i yaz.
    }

    @Override
    public Category deleteCategoryByID(Long id) {
        Optional<Category> optional = categoryRepository.findById(id);
        if (!optional.isPresent()){
            throw new RuntimeException("id yok");
        }
        Category deletedCategory = getCategoriesByID(id);
        categoryRepository.delete(deletedCategory);
        return deletedCategory;
    }
}
