package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductList();
    Product getProductByID(Long id);
    Product addProduct(Product product , Long categoryID);
    Product deleteProduct(Long id);

}
