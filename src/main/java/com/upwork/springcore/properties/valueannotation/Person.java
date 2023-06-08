package com.upwork.springcore.properties.valueannotation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("Upwork")
    private String name;

    @Value(15)
    private int age;


}



