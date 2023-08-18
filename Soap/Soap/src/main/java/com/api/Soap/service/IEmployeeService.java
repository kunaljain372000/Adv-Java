package com.api.Soap.service;


import com.api.Soap.entittes.Employee;
import com.api.Soap.inte.AddEmployeeRequest;
import com.api.Soap.inte.AddEmployeeResponse;
import com.api.Soap.inte.GetEmployeeRequest;
import com.api.Soap.inte.GetEmployeeResponse;

public interface IEmployeeService {

	 public AddEmployeeResponse addEmployee(AddEmployeeRequest request);

	 public GetEmployeeResponse getEmployeeById(GetEmployeeRequest request);

	 public void updateEmployee(Employee employee);

	 public void deleteEmployee(long employeeId);
}