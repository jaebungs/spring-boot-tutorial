package com.spring.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim for an hour!";
    }
}
