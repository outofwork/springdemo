package com.upwork.springcore.properties.valueannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Person myBean() {
        return new Person();
    }
}




