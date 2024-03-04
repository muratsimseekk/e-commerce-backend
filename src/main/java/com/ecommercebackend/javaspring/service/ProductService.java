package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getProductList();
    ProductResponseDto getProductByID(Long id);
    ProductResponseDto addProduct(Product product);
    ProductResponseDto deleteProduct(Long id);

}
