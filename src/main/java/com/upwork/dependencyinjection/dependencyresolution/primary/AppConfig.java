package com.upwork.dependencyinjection.dependencyresolution.primary;

import com.upwork.dependencyinjection.datamodel.Color;
import com.upwork.dependencyinjection.datamodel.ColorBean;
import com.upwork.dependencyinjection.datamodel.OrangeColor;
import com.upwork.dependencyinjection.datamodel.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public RedColor redColor() {
        return new RedColor();
    }

    @Bean
    @Primary
    public OrangeColor orangeColor() {
        return new OrangeColor();
    }

    @Bean
    public ColorBean colorBean(Color color) {
        return new ColorBean(color);
    }
}
