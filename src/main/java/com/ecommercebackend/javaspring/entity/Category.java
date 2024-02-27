package com.ecommercebackend.javaspring.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "category" , schema = "e-commerce")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @NotNull
    @NotBlank(message = "code cannot be blank")
    @Size(min = 2 , max = 20 , message = "Code cannot be less than 2 or more than 20")
    @Column(name = "code")
    private String code;

    @NotNull
    @NotBlank(message = "gender cannot be blank")
    @Size(min = 2 , max = 7 , message = "Gender cannot be less than 2 or more than 7")
    @Column(name = "gender")
    private String gender;

    @NotNull
    @NotBlank(message = "img cannot be blank")
    @Column(name = "img")
    private String img;

    @Nullable
    @Column(name = "rating")
    private Double rating;

    @NotNull
    @NotBlank(message = "title cannot be blank")
    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
    private List<Product> products;

}
