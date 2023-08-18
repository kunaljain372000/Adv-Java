package com.tas.SpringCrud.service;

import java.util.List;

import com.tas.SpringCrud.entities.Employee;



public interface EmployeeService {

	int saveEmployeeDetails(Employee employee);
	
	List<Employee> fetchEmployeeList();
	
	Employee fetchEmployeeById(int id);
	
	int deleteEmployeeById(int id);
	
	int updateEmployee(Employee employee, int id);

	
}
