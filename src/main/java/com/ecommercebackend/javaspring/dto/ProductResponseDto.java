package com.ecommercebackend.javaspring.dto;

public record ProductResponseDto(Long id , String name , Double price , Double rating,
                                 Long sell_count , Long stock , Long store_id , String description) {
}
