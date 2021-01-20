package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empapp.entities.Employee;
import com.empapp.service.EmployeeService;

@SpringBootApplication
public class Empapp2Application implements CommandLineRunner {

	@Autowired
	private EmployeeService empService;

	public static void main(String[] args) {
		SpringApplication.run(Empapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * System.out.println("records are saved..."); empService.save(new
		 * Employee("jaswanth", 35)); empService.save(new Employee("sai", 31));
		 * empService.save(new Employee("kumar", 32)); empService.save(new
		 * Employee("suniil", 28));
		 */
		
	}

}
