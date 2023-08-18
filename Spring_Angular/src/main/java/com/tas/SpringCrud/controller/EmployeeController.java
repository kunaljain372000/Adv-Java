package com.tas.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tas.SpringCrud.entities.Employee;
import com.tas.SpringCrud.service.EmployeeService;



@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/employee")

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public String saveEmployeeDetails(@RequestBody Employee employee) {
	   return  employeeService.saveEmployeeDetails(employee)+"employee details are added";
    }
	
	@GetMapping("/fetch")
	public List<Employee> fetchEmployeeList() {
		   return employeeService.fetchEmployeeList();
    }
	
	@GetMapping("/fetch/{id}")
	public Employee fetchEmployeeById(@PathVariable int id) {
	   return employeeService.fetchEmployeeById(id);
    }
	
	@PutMapping("/update/{id}")
	public String updateEmployee(@RequestBody Employee employee,@PathVariable int id) {
		return employeeService.updateEmployee(employee,id)+"employees details are updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id)+"the current employees are deleted";
	}
}
