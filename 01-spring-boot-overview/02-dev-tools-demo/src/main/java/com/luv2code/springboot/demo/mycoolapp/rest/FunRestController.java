package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    //expose "/" that returns "Hello world"
    @GetMapping("/")
    public String sayHello() {
        return coachName;
    }

    //expose "/workout", a new endpoint

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose "/workout", a new endpoint

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today you're very lucky!";
    }

}
