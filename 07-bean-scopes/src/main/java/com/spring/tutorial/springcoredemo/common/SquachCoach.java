package com.spring.tutorial.springcoredemo.common;

public class SquachCoach implements Coach{
    
    public SquachCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Squash for an hour!";
    }
}
