package com.upwork.springcore.properties.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("Value Annotations")
    private String name;

    @Value("30")
    private Integer age;

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}



