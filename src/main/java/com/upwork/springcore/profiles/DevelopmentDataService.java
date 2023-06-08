package com.upwork.springcore.profiles;

import org.springframework.stereotype.Service;

@Service
public class DevelopmentDataService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from development environment");
    }
}

