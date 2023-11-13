package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // adviced for logging

    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=======>>>> Excecuting @Before advice on AddAccount()");
    }
}
