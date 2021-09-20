package com.demo.sample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sample.model.Employee;
import com.demo.sample.service.EmployeeService;

@RestController
public class SampleController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String welcome() {
		return "<center>Welcome</center> ";
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
		
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployees(@PathVariable Integer id) {
		return employeeService.getEmployees(id);
		
	}
	
	@GetMapping("/employees/{id}/pending")
	public Integer getEmployeesPendingCount(@PathVariable Integer id) {
		return employeeService.getEmployees(id).getPendingCount();
		
	}
}
