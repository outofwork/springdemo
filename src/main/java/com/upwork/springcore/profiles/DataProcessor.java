package com.upwork.springcore.profiles;

import org.springframework.stereotype.Service;

@Service
public class DataProcessor {
    private final DataService dataService;

    public DataProcessor(DataService dataService) {
        this.dataService = dataService;
    }

    public void processData() {
        dataService.fetchData();
        // Process the fetched data
    }
}


