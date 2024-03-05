package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Store;

import java.util.List;

public interface StoreService {
    Store getStoreInfos(Long id);
    Store addStore(Store store);
    List<Store> getStores();
}
