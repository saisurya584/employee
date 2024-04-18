package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save")
	public Employee saveData(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}
	

   
}
