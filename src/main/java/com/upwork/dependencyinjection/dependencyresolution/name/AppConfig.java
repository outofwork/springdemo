package com.upwork.dependencyinjection.dependencyresolution.name;

import com.upwork.dependencyinjection.datamodel.Color;
import com.upwork.dependencyinjection.datamodel.ColorBean;
import com.upwork.dependencyinjection.datamodel.OrangeColor;
import com.upwork.dependencyinjection.datamodel.RedColor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "red")
    public RedColor redColor() {
        return new RedColor();
    }

    @Bean(name = "orange")
    public OrangeColor orangeColor() {
        return new OrangeColor();
    }

    @Bean
    public ColorBean colorBean(@Qualifier("orange") Color color) {
        return new ColorBean(color);
    }
}
