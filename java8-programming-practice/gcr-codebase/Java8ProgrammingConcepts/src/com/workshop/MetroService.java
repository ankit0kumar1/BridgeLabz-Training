package com.workshop;

public class MetroService implements TransportService {
    private String name;
    private double fare;
    private double departureTime;

    public MetroService(String name, double fare, double departureTime) {
        this.name = name;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    @Override
    public String getServiceName() { return name; }

    @Override
    public double getFare() { return fare; }

    @Override
    public double getDepartureTime() { return departureTime; }
}
