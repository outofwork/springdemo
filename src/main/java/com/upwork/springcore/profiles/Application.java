package com.upwork.springcore.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args);

        // Retrieve the DataProcessor bean
        DataProcessor dataProcessor = context.getBean(DataProcessor.class);

        // Process the data
        dataProcessor.processData();

        // Close the application context
        context.close();
    }
}


