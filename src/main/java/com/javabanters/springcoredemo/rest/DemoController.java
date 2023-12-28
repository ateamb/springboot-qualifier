package com.javabanters.springcoredemo.rest;

import com.javabanters.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(@Qualifier("footballCoach") Coach coach) {
        this.myCoach = coach;
    }

//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getWorkout();
    }
}
