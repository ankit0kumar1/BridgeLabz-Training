package com.polymorphismandencapsulation.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideApp {

    public static void main(String[] args) {

        // Creating different vehicles
        Vehicle car = new Car("CAR101", "Amit", 15);
        Vehicle bike = new Bike("BIKE201", "Rohit", 8);
        Vehicle auto = new Auto("AUTO301", "Suresh", 10);

        // Store in list (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Distance for ride
        double distance = 10;

        // Calculate fare dynamically
        for (Vehicle v : vehicles) {

            System.out.println("\n--- Vehicle Details ---");
            v.getVehicleDetails();

            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: " + fare);

            // GPS functionality
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
        }
    }
}
