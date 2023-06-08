package com.upwork.springcore.profiles;

import org.springframework.stereotype.Service;

@Service
public class ProductionDataService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from production environment");
    }
}


