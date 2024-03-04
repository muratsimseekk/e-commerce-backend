package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Address;
import com.ecommercebackend.javaspring.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addAddress(Address address) {
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
