package com.upwork.dependencyinjection.dependencyinjection.constructor;

import com.upwork.dependencyinjection.datamodel.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColorBean {

    private Color color;

    @Autowired
    public ColorBean(Color color) {
        this.color = color;
    }

    public void printColor() {
        color.showColor();
    }

}
