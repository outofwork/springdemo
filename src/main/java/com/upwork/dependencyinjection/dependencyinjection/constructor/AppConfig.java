package com.upwork.dependencyinjection.dependencyinjection.constructor;

import com.upwork.dependencyinjection.datamodel.OrangeColor;
import com.upwork.dependencyinjection.datamodel.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public RedColor redColor() {
        return new RedColor();
    }

    @Bean
    public OrangeColor orangeColor() {
        return new OrangeColor();
    }

    @Bean
    public ColorBean colorBean() {
        return new ColorBean(redColor()); // RedColor Bean is returned here
    }
}
