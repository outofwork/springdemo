package com.upwork.springcore.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyBeanAnnotations myBeanAnnotations = context.getBean(MyBeanAnnotations.class);
        myBeanAnnotations.performOperation();

        MyBeanInterface myBeanInterface = context.getBean(MyBeanInterface.class);
        myBeanInterface.performOperation();

        MyBeanConfig myBeanConfig = context.getBean(MyBeanConfig.class);
        myBeanConfig.performOperation();

        context.close();
    }
}


