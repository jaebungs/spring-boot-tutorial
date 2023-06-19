package com.spring.tutorial.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.tutorial.springcoredemo.common.Coach;
import com.spring.tutorial.springcoredemo.common.SquachCoach;

@Configuration
public class SprotConfig {
    
    @Bean("squash") // custom bean ID, otherwise default bean ID is method name
    public Coach squashCoach() {
        return new SquachCoach();
    }
}
