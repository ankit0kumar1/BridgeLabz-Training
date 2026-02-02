package com.functionalinterface.temperaturealertsystem;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        double threshold = 40.0;

        // Predicate: temperature crosses threshold?
        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 45.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("ALERT! Temperature too high: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature normal: " + currentTemp + "°C");
        }
    }
}

