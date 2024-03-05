package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Address;
import com.ecommercebackend.javaspring.entity.User;
import com.ecommercebackend.javaspring.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;

    private UserService userService;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, UserService userService) {
        this.addressRepository = addressRepository;
        this.userService = userService;
    }

    @Override
    public Address addAddress(Address address , Long userID) {
        User user = userService.getUser(userID);

        user.addAddress(address);
        address.setUser(user);

        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAddressList() {
        return addressRepository.findAll();
    }

    @Override
    public Address deleteAddress(Long id) {
        Optional<Address> optional = addressRepository.findById(id);

        optional.ifPresent(address -> addressRepository.delete(address));
        throw new RuntimeException("Boyle bir address yok");

    }
}
