package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.entity.Store;

public interface StoreService {
    Store getStoreInfos(Long id);
    Store addStore(Store store);
}
