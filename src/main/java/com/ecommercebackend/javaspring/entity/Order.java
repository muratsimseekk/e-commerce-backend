package com.ecommercebackend.javaspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "order" , schema = "ecommerce")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_date")
    private Instant order_date;

//    @OneToMany(mappedBy = "order" , cascade = CascadeType.ALL)
//    private List<Product> productList;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "card_id")
    private Card card;

//    public void addProduct(Product product){
//        if (productList== null){
//            productList = new ArrayList<>();
//        }
//        productList.add(product);
//    }
}
