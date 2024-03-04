package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store , Long> {
}
