package com.spring.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(AssignmentApplication.class, args);
		Car finalCarEngine = appContext.getBean(Car.class);

		System.out.println();
		String result = finalCarEngine.carManufacture("What engine to choose?"); 
		System.out.println(result);
		System.out.println("Me: Okay, thanks Spring.");
	}

}

