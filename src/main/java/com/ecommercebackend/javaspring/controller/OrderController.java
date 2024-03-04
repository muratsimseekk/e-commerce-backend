package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Order;
import com.ecommercebackend.javaspring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderByID(@PathVariable Long id){
        return orderService.getOrderByID(id);
    }

    @PostMapping("/")
    public Order addOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }


}
