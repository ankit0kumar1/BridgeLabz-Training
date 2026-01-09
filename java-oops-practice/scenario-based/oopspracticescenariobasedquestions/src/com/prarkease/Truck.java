package com.prarkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        double penalty = hours > 3 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
