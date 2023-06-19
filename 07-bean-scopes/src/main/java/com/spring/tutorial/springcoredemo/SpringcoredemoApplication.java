package com.spring.tutorial.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@SpringBootApplication // allows Auto Config, Component Scanniing, Additonal configs, etc.
public class SpringcoredemoApplication {

	// define init method
	@PostConstruct
	public void doStartup() {
		System.out.println("DoStartUP : " + getClass().getSimpleName());
	}

	// define destroy method
	@PreDestroy
	public void doPreDestroy() {
		System.out.println("DoPreDestroy : " + getClass().getSimpleName());

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}
}
