package com.zyang25.employeemanagement;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.zyang25.employeemanagement.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementApplication {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeManagementApplication.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		
		//SpringApplication.run(EmployeeManagementApplication.class, args);
		
	    //log.info("Querying employee by id");
	    
	    ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(EmployeeManagementApplication.class)
				.properties("spring.config.name:application,conf",
						"spring.config.location:classpath:application.properties,classpath:h2config.properties")
				.build().run(args);
	    System.out.println("Application Started");
	}
}
