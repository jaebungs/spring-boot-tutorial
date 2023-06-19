package com.spring.tutorial.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tutorial.springcoredemo.common.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;

    // Constructor Injection
    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach) {
        System.out.println("In Controller: " + getClass().getSimpleName());
        myCoach = theCoach;
    }
    
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
