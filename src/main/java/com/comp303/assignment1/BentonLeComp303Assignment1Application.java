package com.comp303.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.comp303.assignment1")
public class BentonLeComp303Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(BentonLeComp303Assignment1Application.class, args);
	}

}
