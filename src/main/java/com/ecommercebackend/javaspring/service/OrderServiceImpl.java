package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Order;
import com.ecommercebackend.javaspring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    private OrderRepository orderRepository;

    private AddressService addressService;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, AddressService addressService) {
        this.orderRepository = orderRepository;
        this.addressService = addressService;
    }

    @Override
    public Order createOrder(Order order) {
//        order.setAddress(addressService.addAddress(order.getAddress()));
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderByID(Long id) {
        Optional<Order> optional = orderRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        throw new RuntimeException("Ilgili id li order bulunamadi");
    }


    //        //1 Category id ile ilgili Category bul.
//       Category category = categoryService.getCategoriesByID(categoryID);
//       //2. categorynin product listesini yeni product i ekle.
//        category.addProduct(product);
//        //3 . Product a category i ekle
//        product.setCategory(category);
//        //4. product i save et.
//        Product savedProduct = productRepository.save(product);
////        return new ProductResponseDto()
//        return null;
}
