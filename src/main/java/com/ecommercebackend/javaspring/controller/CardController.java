package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Card;
import com.ecommercebackend.javaspring.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/card")
public class CardController {

    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> findAllByUser() {
       return cardService.getCardListByUser();
    }

    @PostMapping
    public Card save(@RequestBody Card card) {
        return cardService.addCard(card);
    }

}
