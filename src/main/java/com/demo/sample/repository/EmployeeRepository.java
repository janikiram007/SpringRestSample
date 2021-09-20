package com.demo.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.sample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
