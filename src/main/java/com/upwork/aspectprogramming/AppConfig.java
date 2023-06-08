package com.upwork.aspectprogramming;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import org.springframework.context.annotation.ComponentScan;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.upwork.aspectprogramming")
public class AppConfig {

}

