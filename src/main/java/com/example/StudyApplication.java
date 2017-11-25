package com.example;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import service.SignedService;

@SpringBootApplication
@ComponentScan("service")
public class StudyApplication {
	
	@Autowired
	private SignedService signedService;

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
		
	}
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			Stream<String> name = signedService.getName();
			name.forEach(System.out::println);
		};
	}
}
