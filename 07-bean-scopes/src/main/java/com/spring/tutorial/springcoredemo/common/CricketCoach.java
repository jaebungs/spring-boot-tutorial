package com.spring.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run at least 20 mins!";
    }
}
