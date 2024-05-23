package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee saveEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	void deleteEmployee(long id);
}
