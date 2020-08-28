package com.clg.mgmt.springboot.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This annotation enables the auto-configuration feature of the spring boot module (i.e. java-based configuration and component scanning)
@SpringBootApplication

//The main class serves two purpose in a spring boot application: Configuration and bootstrapping.
public class StudentTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentTeacherApplication.class, args);
	}
}