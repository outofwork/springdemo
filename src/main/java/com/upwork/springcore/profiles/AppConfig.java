package com.upwork.springcore.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
class AppConfig {
    @Bean
    @Profile("development")
    public DataService developmentDataService() {
        return new DevelopmentDataService();
    }

    @Bean
    @Profile("production")
    public DataService productionDataService() {
        return new ProductionDataService();
    }

    @Bean
    public DataProcessor dataProcessor(DataService dataService) {
        return new DataProcessor(dataService);
    }
}


