package com.upwork.springcore.properties.settermethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Person myBean() {
        Person person = new Person();
        person.setName("Upwork");
        person.setAge(15);
        return new Person();
    }
}




