package com.upwork.dependencyinjection.datamodel;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements Color {

    @Override
    public void showColor(){
        System.out.println("Color is RED.");
    }

}
