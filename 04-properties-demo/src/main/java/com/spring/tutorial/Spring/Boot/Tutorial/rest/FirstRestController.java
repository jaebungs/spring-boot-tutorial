package com.spring.tutorial.Spring.Boot.Tutorial.rest;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FirstRestController {

    // inject properteis for "coach.name" and "team.name"
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/") 
    public String sayHello() {
        return "Hello World";
    }

    // expose new endpoint for "teaminfo"
    // http://localhost:8080/teaminfo
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }
}

// With the parent mapping  - localhost:8080/rest/ return 'Hello World'
// Without the parent mapping - localhost:8080 return 'Hello World'