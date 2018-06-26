package com.zyang25.employeemanagement.service;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.zyang25.employeemanagement.H2Configuration;
import com.zyang25.employeemanagement.entity.Employee;
import com.zyang25.employeemanagement.repository.IEmployeeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  classes = { H2Configuration.class }, 
  loader = AnnotationConfigContextLoader.class)
public class EmployeeServiceTest {
	
	@Autowired
    private IEmployeeRepository employeeRepository;
     
    @Test
    public void givenEmployee_whenSave_thenGetOk() {
    	
    	Employee employee = new Employee("Zihao", "Yang");
    	
    	Employee emSaved = employeeRepository.save(employee);
         
    	Optional<Employee> getEmployee = employeeRepository.findById(emSaved.getEmp_no());
        
    	assertEquals("Yang", getEmployee.get().getLast_name());
    	assertEquals("Zihao", getEmployee.get().getFirst_name());
    }
}
