package com.ecommercebackend.javaspring.repository;

import com.ecommercebackend.javaspring.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
