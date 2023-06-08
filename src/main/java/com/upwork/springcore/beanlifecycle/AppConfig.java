package com.upwork.springcore.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyBeanAnnotations myBean() {
        return new MyBeanAnnotations();
    }

    @Bean
    public MyBeanInterface myBeanInterface() {
        return new MyBeanInterface();
    }

    @Bean(
            initMethod = "init",
            destroyMethod = "destroy"
    )
    public MyBeanConfig myBeanConfig() {
        return new MyBeanConfig();
    }
}
