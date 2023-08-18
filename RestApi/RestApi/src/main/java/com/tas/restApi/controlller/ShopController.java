package com.tas.restApi.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tas.restApi.entites.Shop;
import com.tas.restApi.repository.ShopRepository;



@RestController
public class ShopController {

    @Autowired
    private ShopRepository shopRepository;

    @PostMapping("/shops")
    public ResponseEntity<String> createShop(@Validated @RequestBody Shop shop, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body("Validation error");
        }

        shopRepository.save(shop);
        return ResponseEntity.ok("Shop created successfully");
    }
}

