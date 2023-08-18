package com.tas.SpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.tas.SpringCrud.entities.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService{
	
	@Autowired
     private JdbcTemplate jdbcTemplate;
	
	@Override
	public int saveEmployeeDetails(Employee employee) {
		return jdbcTemplate.update("insert into employee(name,department,address)values(?,?,?)",
				new Object[] {employee.getName(),employee.getDepartment(),employee.getAddress()});
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper<Employee>(Employee.class));
	
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		String qry = "select * from employee where id=?";
		return jdbcTemplate.queryForObject(qry,new Object[] {id},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public int deleteEmployeeById(int id) {
		return jdbcTemplate.update("delete from employee where id=?",id);
	}

	@Override
	public int updateEmployee(Employee employee, int id) {
		return jdbcTemplate.update("UPDATE employee SET name = ? ,department = ?,address = ? WHERE id=?",new Object[] {employee.getName(),employee.getDepartment(),employee.getAddress(),id});
	}

}

