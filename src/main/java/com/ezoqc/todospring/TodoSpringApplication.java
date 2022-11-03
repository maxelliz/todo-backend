package com.ezoqc.todospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TodoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoSpringApplication.class, args);
	}

}
