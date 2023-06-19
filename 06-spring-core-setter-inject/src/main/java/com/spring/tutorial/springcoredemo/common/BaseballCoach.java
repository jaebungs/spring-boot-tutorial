package com.spring.tutorial.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// @Lazy
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Hit baseball 100 times!";
    }
}
