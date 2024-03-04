package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Store;
import com.ecommercebackend.javaspring.service.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {

    private StoreServiceImpl storeService;

    @Autowired
    public StoreController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/{id}")
    public Store findStore(@PathVariable Long id){
        return storeService.getStoreInfos(id);
    }

    @PostMapping("/")
    public Store addStore(@RequestBody Store store){
        return storeService.addStore(store);
    }
}
