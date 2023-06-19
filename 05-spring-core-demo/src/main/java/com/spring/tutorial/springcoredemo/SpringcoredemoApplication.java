package com.spring.tutorial.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
	scanBasePackages = {"com.spring.tutorial.springcoredemo", 
		"com.tutorial.util"}
) // allows Auto Config, Component Scanniing, Additonal configs, etc.
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}
}
