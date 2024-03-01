package com.ecommercebackend.javaspring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class User {
    private Long id;
    private String name ;
    private String email;
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id",unique = true,nullable = false)
    private Role role;

    @OneToOne
    @JoinColumn(name = "store_id" , unique = true,nullable = false)
    private Store store;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Address> addressList;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Card> cardList;

    //TODO listler icin null check yaz.
}
