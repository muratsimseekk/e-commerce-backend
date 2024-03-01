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
@Table(name = "user" , schema = "ecommerce")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name ;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
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

    public void addAddress(Address address){
        if (addressList == null){
            addressList =new ArrayList<>();
        }
        addressList.add(address);
    }

    public void addCard(Card card){
        if (cardList == null){
            cardList = new ArrayList<>();
        }
        cardList.add(card);
    }


}
