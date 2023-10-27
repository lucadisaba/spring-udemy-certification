package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //
    // Questa è una dipendenza, DemoController ha bisogno di Coach che fornisce il metodo dailyWorkout
    //
    private Coach myCoach;

    // constructor injection
     @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    /*

    Setter injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

     */

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
