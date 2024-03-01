package com.ecommercebackend.javaspring.dto;

public record ProductResponseDto(Long id , String name , Double price , Double rating,
                                 Long sell_count , Long stock , String description ) {
}
