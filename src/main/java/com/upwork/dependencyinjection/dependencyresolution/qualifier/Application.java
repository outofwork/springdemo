package com.upwork.dependencyinjection.dependencyresolution.qualifier;

import com.upwork.dependencyinjection.datamodel.ColorBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args);

        ColorBean colorBean = context.getBean(ColorBean.class);
        colorBean.printColor();

        context.close();
    }
}


