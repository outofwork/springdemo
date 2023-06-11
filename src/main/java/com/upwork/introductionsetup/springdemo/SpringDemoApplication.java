package com.upwork.introductionsetup.springdemo;

import com.upwork.introductionsetup.springdemo.config.AppConfig;
import com.upwork.introductionsetup.springdemo.model.EnglishGreeting;
import com.upwork.introductionsetup.springdemo.model.Greeting;
import com.upwork.introductionsetup.springdemo.model.SpanishGreeting;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Greeting englishGreeting = context.getBean(EnglishGreeting.class);
        Greeting spanishGreeting = context.getBean(SpanishGreeting.class);

        englishGreeting.sayHello();
        spanishGreeting.sayHello();

    }

}
