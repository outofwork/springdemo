package com.upwork.dependencyinjection.dependencyinjection.autowire;

import com.upwork.dependencyinjection.datamodel.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorBean {

    @Autowired
    private Color color;

    public void printColor() {
        color.showColor();
    }

}
