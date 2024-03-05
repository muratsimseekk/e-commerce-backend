package com.ecommercebackend.javaspring.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product" , schema = "ecommerce")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;


    @Column(name = "name")
    private String name;


    @Column(name = "price")
    private Double price;


    @Column(name = "rating")
    private Double rating;

    @Column(name = "sell_count")
    private Long sellCount;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "description")
    private String description;


    @Column(name = "images")
    private String images;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "store_id")
    private Store store;

//    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
//    @JoinColumn(name = "order_id")
//    private Order order;

}
