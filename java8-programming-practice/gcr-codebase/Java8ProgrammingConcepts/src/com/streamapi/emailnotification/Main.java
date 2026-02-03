package com.streamapi.emailnotification;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "ankit@gmail.com",
                "ravi@gmail.com",
                "neha@gmail.com"
        );

        // send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }

    public static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
