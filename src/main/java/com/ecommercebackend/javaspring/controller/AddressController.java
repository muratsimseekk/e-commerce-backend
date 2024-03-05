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

    @PostMapping("/{id}")
    public Address addAddress(@RequestBody Address address , @PathVariable Long id){
        return addressService.addAddress(address,id);
    }

    @DeleteMapping("/{id}")
    public Address deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
