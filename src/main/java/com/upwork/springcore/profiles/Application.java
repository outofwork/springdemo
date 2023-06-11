package com.upwork.springcore.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DataProcessor dataProcessor = context.getBean(DataProcessor.class);
        dataProcessor.processData();

        context.close();
    }
}


