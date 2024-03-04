package com.ecommercebackend.javaspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "store" , schema = "ecommerce")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id ;

    @Column(name = "name")
    private String  name;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "tax_no")
    private Long tax_no;

    @Column(name = "bank_account")
    private Long bank_account;

//    @OneToOne(mappedBy = "store")
//    private User user;
}
