package com.ecommercebackend.javaspring.controller;
import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Product;
import com.ecommercebackend.javaspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    //TODO her bir product ekledigimde Category ve Product birbirini cagiriyor . Bu durumun onune gecmek icin DTO yaz .
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<ProductResponseDto> productList(){
        return productService.getProductList();
    }

    @PostMapping("/{categoryID}")
    public ProductResponseDto save(@PathVariable Long categoryID , @RequestBody Product product){
        return productService.addProduct(product , categoryID);

    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductByID(@PathVariable Long id){
        return productService.getProductByID(id);
    }

    @DeleteMapping("/{id}")
    public ProductResponseDto delete(@PathVariable Long id){
        return productService.deleteProduct(id);
    }


}
