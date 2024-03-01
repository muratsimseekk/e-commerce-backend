package com.ecommercebackend.javaspring.dto;

public record ProductResponseDto( Long category_id,Long id , String name , Double price , Double rating,
                                 Long sell_count , Long stock , String description , String images ,Long store_id) {
    //TODO store_id icin bir degisken gelecek . store_id yi donen ayri bir response dto olusturup buraya new StoreIDResponse gibi verilebilir .
}
