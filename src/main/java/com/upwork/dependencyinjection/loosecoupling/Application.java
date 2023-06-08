package com.upwork.dependencyinjection.loosecoupling;

public class Application {

    public static void main(String[] args) {
        ColorBean color = new ColorBean(new OrangeColor()); // Dependency Injection
        color.printColor();

    }
}
