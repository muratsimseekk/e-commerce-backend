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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long card_id;

    @Column(name = "card_no")
    private Long card_no;

    @Column(name = "card_expire_month")
    private Long card_expire_month;

    @Column(name = "card_expire_year")
    private Long card_expire_year;

    @Column(name = "card_ccv")
    private Long card_ccv;

    @Column(name = "card_name")
    private String card_name;

//    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
//    @JoinColumn(name = "user_id")
//    private User user;

    //TODO card response dto order null olarak gozukmesin
    @OneToOne(mappedBy = "card")
    private Order order;
}
