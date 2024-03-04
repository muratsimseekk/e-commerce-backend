package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Address;

import java.util.List;

public interface AddressService {

    Address addAddress(Address address);
    List<Address> getAddressList();
    Address deleteAddress(Long id);
}