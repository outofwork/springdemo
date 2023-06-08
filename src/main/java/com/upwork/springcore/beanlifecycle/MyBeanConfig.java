package com.upwork.springcore.beanlifecycle;


import org.springframework.stereotype.Component;

@Component
public class MyBeanConfig {
    public MyBeanConfig() {
        System.out.println("1. MyBeanConfig: ColorBean Constructor Instantiated");
    }

    public void init() {
        System.out.println("2. MyBeanConfig: ColorBean initialized");
    }

    public void performOperation() {
        System.out.println("3. MyBeanConfig: Performing operation");
    }

    public void destroy() {
        System.out.println("4. MyBeanConfig: ColorBean destroyed");
    }
}

