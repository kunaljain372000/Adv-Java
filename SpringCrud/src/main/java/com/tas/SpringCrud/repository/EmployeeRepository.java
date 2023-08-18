package com.tas.SpringCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tas.SpringCrud.entities.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
