package com.upwork.aspectprogramming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = context.getBean(MyService.class);

        myService.doSomething();
        System.out.println("------------------------\n");

        String result = myService.getSomething();
        System.out.println("Result: " + result);
        System.out.println("------------------------\n");

        try {
            myService.throwException();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("------------------------\n");

        context.close();
    }
}
