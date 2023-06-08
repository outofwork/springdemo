package com.upwork.dependencyinjection.dependencyinjection.autowire;

import com.upwork.dependencyinjection.datamodel.OrangeColor;
import com.upwork.dependencyinjection.datamodel.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public RedColor redColor() {
        return new RedColor();
    }

    @Bean
    public OrangeColor orangeColor() {
        return new OrangeColor();
    }

    @Bean
    public ColorBean colorBean() {
        return new ColorBean();
    }
}
