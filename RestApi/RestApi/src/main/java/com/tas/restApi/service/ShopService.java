package com.tas.restApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tas.restApi.entites.Shop;
import com.tas.restApi.repository.ShopRepository;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public void validateShop(Shop shop) {
        if (shop.getName() == null || shop.getName().isEmpty()) {
            throw new IllegalArgumentException("Shop name is required.");
        }
        if (shop.getAddress() == null || shop.getAddress().isEmpty()) {
            throw new IllegalArgumentException("Shop address is required.");
        }
        
    }

    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }
}

