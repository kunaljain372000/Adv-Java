package com.tas.restApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tas.restApi.entites.User;
import com.tas.restApi.repository.UserRepository;
    
	@Service
	public class EmployeeService {

	    @Autowired
	    private UserRepository userRepository;

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public User getUserById(Long userId) {
	        return userRepository.findById(userId)
	                .orElse(null);
	    }
	}


