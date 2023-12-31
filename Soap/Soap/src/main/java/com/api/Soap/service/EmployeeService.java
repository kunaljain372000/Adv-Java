package com.api.Soap.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Soap.entittes.Employee;
import com.api.Soap.inte.AddEmployeeRequest;
import com.api.Soap.inte.AddEmployeeResponse;
import com.api.Soap.inte.EmployeeInfo;
import com.api.Soap.inte.GetEmployeeRequest;
import com.api.Soap.inte.GetEmployeeResponse;
import com.api.Soap.inte.ServiceStatus;
import com.api.Soap.repo.EmployeeRepository;
import com.api.Soap.serviceImpl.EmployeeHelper;







@Service
public class EmployeeService implements IEmployeeService{

	 @Autowired
	 private EmployeeRepository employeeRepository;

	 @Autowired
	 private EmployeeHelper employeeHelper;

	@Override
	public AddEmployeeResponse addEmployee(AddEmployeeRequest request) {
		
		Employee empModel = employeeHelper.prepareEmployeeModel(request);
		
		employeeRepository.save(empModel);
		
		AddEmployeeResponse response = new AddEmployeeResponse();
		ServiceStatus serviceStatus =  new ServiceStatus();
		serviceStatus.setStatus("SUCCESS");
		serviceStatus.setMessage("Content Added Successfully");
		response.setServiceStatus(serviceStatus);
		
		return response;
	}
	
	@Override
	public GetEmployeeResponse getEmployeeById(GetEmployeeRequest request) {
		long empId = request.getEmployeeId();
		
		Employee obj = employeeRepository.findByEmployeeId(empId);
		
		GetEmployeeResponse getEmployeeResponse  = new GetEmployeeResponse();
		EmployeeInfo employeeInfo = new EmployeeInfo();
		BeanUtils.copyProperties(obj,employeeInfo);
		getEmployeeResponse.setEmployeeInfo(employeeInfo);
		return getEmployeeResponse;
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	

}
