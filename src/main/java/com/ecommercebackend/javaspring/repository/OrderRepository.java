package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order , Long> {
}
