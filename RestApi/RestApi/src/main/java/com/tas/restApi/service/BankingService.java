package com.tas.restApi.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tas.restApi.entites.User;
import com.tas.restApi.repository.UserRepository;

@Service
public class BankingService {

    @Autowired
    private UserRepository userRepository;

    public User updateUserDetails(Long userId, User updatedUser) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + userId));

        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        

        return userRepository.save(existingUser);
    }
}


