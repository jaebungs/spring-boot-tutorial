package com.spring.tutorial.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tutorial.springcoredemo.common.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;
    private Coach anotherCoach;

    // Constructor Injection
    @Autowired
    public DemoController(
        @Qualifier("swimCoach") Coach theCoach,
        @Qualifier("swimCoach") Coach theAnotherCoach) {
        System.out.println("In Controller: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/scopes")
    public String scopeCheck() {
        return "Compare Beans : myCoach == antoherCoach : " + (myCoach == anotherCoach);
    }
    
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
