package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Store;
import com.ecommercebackend.javaspring.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService{

    private StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store getStoreInfos(Long id) {
        Optional<Store> optional = storeRepository.findById(id);

        if (optional.isPresent()){
            return optional.get();
        }

        throw new RuntimeException("Ilgili idli store bulunamadi");
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public List<Store> getStores() {
        return storeRepository.findAll();
    }
}
