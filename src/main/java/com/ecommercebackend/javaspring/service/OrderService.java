package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);
    List<Order> getOrders();
    Order getOrderByID(Long id);
}
