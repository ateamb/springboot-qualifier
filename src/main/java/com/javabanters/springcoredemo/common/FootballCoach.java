package com.javabanters.springcoredemo.common;

import org.springframework.stereotype.Component;

//marks the class as a spring bean
@Component
public class FootballCoach implements Coach {


    @Override
    public String getWorkout() {
        return "Practice running for 20 mins";
    }
}
