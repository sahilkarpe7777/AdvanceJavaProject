package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.UserRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
	
		return userRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return userRepository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return userRepository.save(emp);
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}

}
