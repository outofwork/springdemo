package com.upwork.springcore.properties.constructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Person myBean() {
        return new Person("Upwork" , 15);
    }
}




