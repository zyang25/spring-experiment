package com.zyang25.employeemanagement;

import java.util.Arrays;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.zyang25.employeemanagement.entity.Employee;
import com.zyang25.employeemanagement.service.EmployeeService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);
    
	@Autowired
	private EmployeeService employeeService;
	
	@Override
    public void run(String...args) throws Exception {
        logger.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args));
        
        Optional<Employee> employeeOpt = employeeService.findEmployeeById(10011);
        
        if(employeeOpt.isPresent())
        	logger.info(employeeOpt.toString());
        
    }

}
