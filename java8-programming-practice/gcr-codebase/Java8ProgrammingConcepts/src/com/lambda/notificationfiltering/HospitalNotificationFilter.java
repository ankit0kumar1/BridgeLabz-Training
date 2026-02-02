package com.lambda.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalNotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", "BP is dangerously high!"),
                new Alert("MEDICINE", "Take insulin at 8 PM"),
                new Alert("APPOINTMENT", "Doctor visit tomorrow 10 AM"),
                new Alert("GENERAL", "Health tips: Drink water")
        );

        String preference = "ONLY_EMERGENCY"; 
        // options: ONLY_EMERGENCY, MEDICINE_AND_APPOINTMENT, ALL

        Predicate<Alert> filter = switch (preference) {
            case "ONLY_EMERGENCY" -> alert -> alert.type.equals("EMERGENCY");

            case "MEDICINE_AND_APPOINTMENT" -> alert ->
                    alert.type.equals("MEDICINE") || alert.type.equals("APPOINTMENT");

            case "ALL" -> alert -> true;

            default -> alert -> false;
        };

        System.out.println("User Preference: " + preference);
        System.out.println("Filtered Alerts:");

        alerts.stream()
              .filter(filter)
              .forEach(System.out::println);
    }
}

