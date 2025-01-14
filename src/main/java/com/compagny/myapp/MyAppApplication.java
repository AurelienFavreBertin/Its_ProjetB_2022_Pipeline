package com.compagny.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
@EnableWebMvc
public class MyAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}
}
