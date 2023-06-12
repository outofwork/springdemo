package com.upwork.springtesting.mock;


import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public boolean sendEmail(String recipient, String subject, String message) {
        // Fetch data from some external source and Logic to send email
        return true;
    }
}

