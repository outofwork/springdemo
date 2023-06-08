package com.upwork.springcore.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class MyBeanInterface implements InitializingBean, DisposableBean {
    public MyBeanInterface() {
        System.out.println("1. MyBeanInterface: ColorBean Constructor Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("2. MyBeanInterface: ColorBean Initialized");
    }

    public void performOperation() {
        System.out.println("3. MyBeanInterface: Performing operation");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("4. MyBeanInterface: ColorBean Destroyed.");
    }
}


