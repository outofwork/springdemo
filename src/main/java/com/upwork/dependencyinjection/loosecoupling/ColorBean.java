package com.upwork.dependencyinjection.loosecoupling;

public class ColorBean {

    private final Color color;

    ColorBean(Color color) {
        this.color = color;
    }

    public void printColor() {
        color.showColor();
    }

}
