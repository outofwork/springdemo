package com.upwork.introductionsetup.springdemo.config;

import com.upwork.introductionsetup.springdemo.model.SpanishGreeting;
import com.upwork.introductionsetup.springdemo.model.EnglishGreeting;
import com.upwork.introductionsetup.springdemo.model.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Greeting englishGreeting() {
        return new EnglishGreeting();
    }

    @Bean
    public Greeting spanishGreeting() {
        return new SpanishGreeting();
    }
}
