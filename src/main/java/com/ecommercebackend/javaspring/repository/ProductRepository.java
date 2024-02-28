package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
//     ProductResponseDto save ( Long categoryID , Product product);
}
