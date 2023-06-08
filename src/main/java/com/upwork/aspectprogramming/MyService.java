package com.upwork.aspectprogramming;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    public void doSomething() {
        System.out.println("doSomething()");
    }

    public String getSomething() {
        System.out.println("getSomething()");
        return "getSomething()";
    }

    public void throwException() throws Exception {
        System.out.println("throwException()");
        throw new Exception("throwException()");
    }
}
