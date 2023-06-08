package com.upwork.dependencyinjection.datamodel;

import org.springframework.stereotype.Component;

@Component
public class OrangeColor implements Color {

    @Override
    public void showColor(){
        System.out.println("Color is ORANGE.");
    }
}
