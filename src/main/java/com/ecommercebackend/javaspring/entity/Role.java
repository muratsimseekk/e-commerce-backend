package com.ecommercebackend.javaspring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class Role {



    @OneToOne(mappedBy = "role",cascade = CascadeType.ALL)
    private User user;
}
