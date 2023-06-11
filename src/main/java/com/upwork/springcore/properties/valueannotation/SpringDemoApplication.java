package com.upwork.springcore.properties.valueannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        context.close();
    }

}
