package com.api.Soap.serviceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.api.Soap.entittes.Employee;
import com.api.Soap.inte.AddEmployeeRequest;




@Component
public class EmployeeHelper {

	public Employee prepareEmployeeModel(AddEmployeeRequest request) 
	{ 
		
		Employee employee = new Employee();
		BeanUtils.copyProperties(request.getEmployeeInfo(), employee);
	    return employee;
	}
}
