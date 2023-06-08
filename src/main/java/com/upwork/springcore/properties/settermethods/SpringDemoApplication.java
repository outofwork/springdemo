package com.upwork.springcore.properties.settermethods;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person bean = context.getBean(Person.class);

        System.out.println(bean.getAge());
        System.out.println(bean.getName());

    }

}
