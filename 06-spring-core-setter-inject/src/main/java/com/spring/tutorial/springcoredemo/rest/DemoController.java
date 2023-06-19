package com.spring.tutorial.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tutorial.springcoredemo.common.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;

    // Constructor Injection
    // @Autowired
    // public DemoController(Coach theCoach) {
    //     myCoach = theCoach;
    // }

    // Setter Injection
    @Autowired
    private void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }
    
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
