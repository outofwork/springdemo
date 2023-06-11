package com.upwork.dependencyinjection.dependencyinjection.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ColorBean colorBean = context.getBean(ColorBean.class);
        colorBean.printColor();

        context.close();
    }
}


