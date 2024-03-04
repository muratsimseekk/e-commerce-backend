package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Card;
import com.ecommercebackend.javaspring.entity.User;
import com.ecommercebackend.javaspring.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{

    private CardRepository cardRepository;
    private UserService userService;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository, UserService userService) {
        this.cardRepository = cardRepository;
        this.userService = userService;
    }

    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getCardListByUser(Long id) {
//        return cardRepository.findAllByUserId(id);
    return  null;
    }

    @Override
    public Card updateCard(Card card) {
        return null;
    }

    @Override
    public Card deleteCard(Long id) {
        return null;
    }
}
