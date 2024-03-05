package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductResponseDto> getProductList();
    ProductResponseDto getProductByID(Long id);
    ProductResponseDto addProduct(Product product , Long category_id , Long store_id );
    ProductResponseDto deleteProduct(Long id);

}
