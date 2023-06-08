package com.upwork.springcore.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class MyBeanAnnotations {

    public MyBeanAnnotations() {
        System.out.println("1. MyBeanAnnotations: ColorBean Constructor Instantiated");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. MyBeanAnnotations: ColorBean initialized");
    }

    public void performOperation() {
        System.out.println("3. MyBeanAnnotations: Performing operation");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("4. MyBeanAnnotations: ColorBean destroyed");
    }
}

