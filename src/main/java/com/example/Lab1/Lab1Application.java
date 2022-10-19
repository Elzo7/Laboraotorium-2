package com.example.Lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		System.out.println("To jest robota dev2");
		System.out.println("Start application");
		System.out.println("Test Laboratorium 1");

		System.out.println("Jestem spokojnym masterem");
		System.out.println("Jestem konfliktowy 2");
		System.out.println("Jestem konliktowy 1");

		SpringApplication.run(Lab1Application.class, args);
		System.out.println(new Date());
	}

}
