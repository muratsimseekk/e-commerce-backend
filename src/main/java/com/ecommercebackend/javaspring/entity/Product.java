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

    @NotNull
    @Size(min = 2 , max = 45 , message = "name should be between 2 and 45 ")
    @NotBlank(message = "name cannot be blank")
    @Column(name = "name")
    private String name;

    @NotNull(message = "price cannot be null")
    @Column(name = "price")
    private Double price;

    @Nullable
    @Column(name = "rating")
    private Double rating;

    @Min(value = 0 , message = "sell count cannot be less than 0")
    @NotNull(message = "sell count cannot be null - should be minimum 0")
    @Column(name = "sell_count")
    private Long sellCount;

    @Min(value = 0 , message = "stock should be min 0")
    @NotNull(message = "stock cannot be null")
    @Column(name = "stock")
    private Long stock;

    @NotNull(message = "store_id cannot be null")
    @Column(name = "store_id")
    private Long storeId;

    @NotNull(message = "description cannot be null")
    @NotBlank(message = "description cannot be blank")
    @Column(name = "description")
    private String description;

    @Nullable
    @Column(name = "images")
    private String images;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;

}
