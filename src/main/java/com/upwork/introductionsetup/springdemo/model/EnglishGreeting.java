package com.upwork.introductionsetup.springdemo.model;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello English !!");
    }

}
