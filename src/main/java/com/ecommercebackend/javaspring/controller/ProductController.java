package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Product;
import com.ecommercebackend.javaspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> productList(){
        return productService.getProductList();
    }


//    public Product addProduct(){
//
//    }

}
