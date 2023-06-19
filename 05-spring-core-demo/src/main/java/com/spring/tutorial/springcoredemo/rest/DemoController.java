package com.spring.tutorial.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    // defiene a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired // no need if only one constructor is present
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
// How it works?
// Spring framework works behind the scenes to scan the package
// for classes that implements the Coach interface.
// Equvalent to:
// Coach theCoach = new CricketCoach();
// DemoController demoController = new DemoController(theCoach);