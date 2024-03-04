package com.ecommercebackend.javaspring.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "category" , schema = "ecommerce")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "code")
    private String code;


    @Column(name = "gender")
    private String gender;


    @Column(name = "img")
    private String img;


    @Column(name = "rating")
    private Double rating;


    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
    private List<Product> products ;

    public void addProduct(Product product){
        if (products==null){
            products = new ArrayList<>();
        }
        products.add(product);
    }

}
