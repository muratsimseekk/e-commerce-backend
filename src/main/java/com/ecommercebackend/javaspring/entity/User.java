package com.ecommercebackend.javaspring.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
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


    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


//    @OneToOne
//    @JoinColumn(name = "store_id")
//    private Store store;

//    @Nullable
//    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
//    private List<Address> addressList;
//
//    @Nullable
//    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
//    private List<Card> cardList ;

//    public void addAddress(Address address){
//        if (addressList == null){
//            addressList =new ArrayList<>();
//        }
//        addressList.add(address);
//    }
//
//    public void addCard(Card card){
//        if (cardList == null){
//            cardList = new ArrayList<>();
//        }
//        cardList.add(card);
//    }


}
