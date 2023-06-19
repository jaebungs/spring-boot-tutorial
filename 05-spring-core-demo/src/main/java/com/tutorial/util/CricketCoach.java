package com.tutorial.util;

import org.springframework.stereotype.Component;

import com.spring.tutorial.springcoredemo.rest.Coach;

@Component // Component annotation is used to register this class as a bean in the spring container. 
// Makes it available for autowiring (dependency Injection).
public class CricketCoach implements Coach {
    
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!@@!";
    }
}
