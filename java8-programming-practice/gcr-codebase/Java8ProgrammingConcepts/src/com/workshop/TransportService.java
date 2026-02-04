package com.workshop;

public interface TransportService {
    String getServiceName();
    double getFare();
    double getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getServiceName() + " | Fare: ₹" + getFare() + " | Departure: " + getDepartureTime());
    }

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
