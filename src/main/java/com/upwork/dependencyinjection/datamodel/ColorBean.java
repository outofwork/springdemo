package com.upwork.dependencyinjection.datamodel;

public class ColorBean {

    private Color color;

    public ColorBean(Color color) {
        this.color = color;
    }

    public void printColor() {
        color.showColor();
    }

}
