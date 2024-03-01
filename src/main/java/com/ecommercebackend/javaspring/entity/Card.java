package com.ecommercebackend.javaspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "card" , schema = "ecommerce")
public class Card {

    private Long card_id;
    private Long card_no;
    private Long card_expire_month;
    private Long getCard_expire_year;
    private Long card_ccv;
    private String card_name;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
