package com.workshop;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<TransportService> services = List.of(
            new BusService("Bus 101", 50, 9.30),
            new BusService("Bus 102", 60, 9.15),
            new MetroService("Metro Blue", 40, 9.00),
            new TaxiService("City Taxi", 120, 9.45),
            new AmbulanceService("City Ambulance", 0, 9.05) 
        );

        double userTime = 9.0; 

        System.out.println("=== Available Services for Passenger ===");
        List<TransportService> available = services.stream()
            .filter(s -> s.getDepartureTime() >= userTime)          
            .sorted(Comparator.comparingDouble(TransportService::getFare)) 
            .collect(Collectors.toList());

        available.forEach(TransportService::printServiceDetails); 

        System.out.println("\n=== Live Dashboard ===");
        services.forEach(s ->
            System.out.println("Live Service: " + s.getServiceName() +
                               " | Fare: " + s.getFare() +
                               " | Departure: " + s.getDepartureTime())
        );

        class Passenger {
            String name; String route; double fare;
            Passenger(String name, String route, double fare) { this.name = name; this.route = route; this.fare = fare; }
            String getRoute() { return route; }
            double getFare() { return fare; }
        }

        List<Passenger> passengers = List.of(
            new Passenger("Amit", "Route1", 50),
            new Passenger("Riya", "Route2", 60),
            new Passenger("Neha", "Route1", 55)
        );

        Map<String, Double> totalFareByRoute = passengers.stream()
            .collect(Collectors.groupingBy(Passenger::getRoute,
                    Collectors.summingDouble(Passenger::getFare)));

        System.out.println("\n=== Total Fare by Route ===");
        totalFareByRoute.forEach((route, total) -> System.out.println(route + " → ₹" + total));

        System.out.println("\n=== Emergency Services ===");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("PRIORITY SERVICE: " + s.getServiceName()));
    }
}
