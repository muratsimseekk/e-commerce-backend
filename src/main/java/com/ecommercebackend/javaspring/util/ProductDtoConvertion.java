package com.ecommercebackend.javaspring.util;

import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDtoConvertion {

    public static List<ProductResponseDto> convertProductList (List<Product> productList){
        List<ProductResponseDto> productResponses = new ArrayList<>();

        productList.stream().forEach(product -> productResponses.add(new ProductResponseDto(product.getCategory().getId(), product.getId() , product.getName(),
                product.getPrice(), product.getRating(), product.getSellCount(),product.getStock(),
                product.getDescription() ,product.getImages() )));
        //,product.getStore().getId()
        return productResponses;
    }

    public static ProductResponseDto convertProduct(Product product){
        return new ProductResponseDto(product.getCategory().getId(),product.getId() , product.getName(),
                product.getPrice(), product.getRating(), product.getSellCount(),product.getStock(),
                product.getDescription() ,product.getImages());
    }

}
