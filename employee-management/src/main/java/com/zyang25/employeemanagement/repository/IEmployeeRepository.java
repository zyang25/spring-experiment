package com.zyang25.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.zyang25.employeemanagement.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {
	
}
