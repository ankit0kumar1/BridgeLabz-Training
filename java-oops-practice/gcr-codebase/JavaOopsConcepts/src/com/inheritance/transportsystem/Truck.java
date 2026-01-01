package com.inheritance.transportsystem;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("---------------------------");
    }
}