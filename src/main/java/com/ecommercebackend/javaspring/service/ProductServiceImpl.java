package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.entity.Product;
import com.ecommercebackend.javaspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private CategoryService categoryService;
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(CategoryService categoryService, ProductRepository productRepository) {
        this.categoryService = categoryService;
        this.productRepository = productRepository;
    }

//    @Override
//    public ProductResponseDto save(Long categoryID, Product product) {
//        //1 Category id ile ilgili Category bul.
//       Category category = categoryService.getCategoriesByID(categoryID);
//       //2. categorynin product listesini yeni product i ekle.
//        category.addProduct(product);
//        //3 . Product a category i ekle
//        product.setCategory(category);
//        //4. product i save et.
//        Product savedProduct = productRepository.save(product);
////        return new ProductResponseDto()
//        return null;
//    }
}
