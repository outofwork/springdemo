package com.upwork.introductionsetup.springdemo.model;

import org.springframework.stereotype.Component;

@Component
public class SpanishGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hola Spanish !!");
    }

}
