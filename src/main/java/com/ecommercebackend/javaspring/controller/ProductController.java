package com.ecommercebackend.javaspring.controller;
import com.ecommercebackend.javaspring.entity.Product;
import com.ecommercebackend.javaspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{categoryID}")
    public Product save(@PathVariable Long categoryID , @RequestBody Product product){
        return productService.addProduct(product , categoryID);
    }

    @GetMapping("/{id}")
    public Product getProductByID(@PathVariable Long id){
        return productService.getProductByID(id);
    }

    @DeleteMapping("/{id}")
    public Product delete(@PathVariable Long id){
        return productService.deleteProduct(id);
    }


}
