package com.ecommercebackend.javaspring.controller;

import com.ecommercebackend.javaspring.entity.Store;
import com.ecommercebackend.javaspring.service.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    private StoreServiceImpl storeService;

    @Autowired
    public StoreController(StoreServiceImpl storeService) {
        this.storeService = storeService;
    }

    //TODO getStores 400 Bad request hatasi veriyor coz.
    @GetMapping("/get")
    public List<Store> getStores(){
        return storeService.getStores();
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
