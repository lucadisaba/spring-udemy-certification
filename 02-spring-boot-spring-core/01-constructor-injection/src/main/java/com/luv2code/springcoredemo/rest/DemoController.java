package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //
    // Questa è una dipendenza, DemoController ha bisogno di Coach che fornisce il metodo dailyWorkout
    //
    private Coach myCoach;

    //
    // Iniettando l'implementazione di Coach Spring scansiona un @component che IMPLEMENTI l'interfaccia Coach
    // La trova, inietta CricketCoach
    //

    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    //
     // Quello che fa in background Spring sopra con autowired:
    // Coach theCoach = new CricketCoach();
    // DemoController demoController = new DemoController(theCoach);
    //

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
