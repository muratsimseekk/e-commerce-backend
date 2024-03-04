package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Address;
import com.ecommercebackend.javaspring.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressServiceImpl addressService;

    @Autowired
    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/")
    public List<Address> getAddresses(){
        return addressService.getAddressList();
    }

    @PostMapping("/")
    public Address addAddress(Address address){
        return addressService.addAddress(address);
    }

    @DeleteMapping("/{id}")
    public Address deleteAddress(Long id){
        return addressService.deleteAddress(id);
    }
}
