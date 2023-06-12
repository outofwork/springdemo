package com.upwork.springtesting.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final EmailService emailService;

    @Autowired
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public boolean sendNotification(String recipient, String message) {
        String subject = "Notification";
        return emailService.sendEmail(recipient, subject, message);
    }
}

