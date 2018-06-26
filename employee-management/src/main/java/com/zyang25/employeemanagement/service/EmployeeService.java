package com.zyang25.employeemanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyang25.employeemanagement.entity.Employee;
import com.zyang25.employeemanagement.repository.IEmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private IEmployeeRepository employeeRepo;
	
	public Optional<Employee> findEmployeeById(int id) {
		
		return employeeRepo.findById(id);
	}
}
