package com.spring.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    
    @Override
    public String getDailyWorkout() {
        return "Run at least 20 mins!";
    }
}
