package com.tas.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tas.SpringBoot.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
