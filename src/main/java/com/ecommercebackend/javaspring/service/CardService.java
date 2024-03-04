package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Card;

import java.util.List;

public interface CardService {
    Card addCard(Card card);
    List<Card> getCardListByUser(Long id);
    Card updateCard(Card card);
    Card deleteCard(Long id);
}
