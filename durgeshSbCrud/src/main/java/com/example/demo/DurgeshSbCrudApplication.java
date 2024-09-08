package com.example.demo;

import org.hibernate.Version;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DurgeshSbCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DurgeshSbCrudApplication.class, args);
		System.out.println("Y  E  S  S  S  S,YOU ARE DOING WELL ");
		System.out.println("duregshCrud");
		System.out.println("Hibernate version: " + Version.getVersionString());
	}

}
