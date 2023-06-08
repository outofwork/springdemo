package com.upwork.introductionsetup.corejava;

import com.upwork.introductionsetup.corejava.model.EnglishGreeting;
import com.upwork.introductionsetup.corejava.model.Greeting;
import com.upwork.introductionsetup.corejava.model.SpanishGreeting;

public class HelloWorld {

    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting();
        Greeting spanishGreeting = new SpanishGreeting();

        spanishGreeting.sayHello();
        englishGreeting.sayHello();
    }
}
