package com.example;

import com.example.employee.Employee;
import com.example.employee.EmployeeDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringbootJenkinsDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDemoAppApplication.class, args);
	}
}
