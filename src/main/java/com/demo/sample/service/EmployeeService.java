package com.demo.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.sample.model.Employee;
import com.demo.sample.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee getEmployees(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> e =  employeeRepository.findById(id);
		if(e.isPresent())
			return e.get();
		else
			return null;
	}
	
	
}
