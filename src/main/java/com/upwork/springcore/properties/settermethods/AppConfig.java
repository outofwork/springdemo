package com.upwork.springcore.properties.settermethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Setter Methods");
        person.setAge(30);
        return person;
    }
}




