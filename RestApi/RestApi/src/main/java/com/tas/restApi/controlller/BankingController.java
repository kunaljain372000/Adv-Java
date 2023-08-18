package com.tas.restApi.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tas.restApi.entites.User;
import com.tas.restApi.service.BankingService;

import java.util.NoSuchElementException;
@RestController
@RequestMapping("/api/banking")
public class BankingController {

    @Autowired
    private BankingService bankingService;

    @PostMapping("/users/{userId}")
    public ResponseEntity<User> updateUserDetails(@PathVariable Long userId, @RequestBody User updatedUser) {
        try {
            User savedUser = bankingService.updateUserDetails(userId, updatedUser);
            return ResponseEntity.ok(savedUser);
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
}



