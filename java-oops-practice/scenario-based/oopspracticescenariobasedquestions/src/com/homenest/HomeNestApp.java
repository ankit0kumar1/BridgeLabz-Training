package com.homenest;

public class HomeNestApp {
    public static void main(String[] args) {

        Device[] devices = {
            new Light("L-01"),
            new Camera("C-01"),
            new Thermostat("T-01"),
            new Lock("K-01")
        };

        for (Device d : devices) {
            d.turnOn();
            d.reset();   // polymorphic behavior
            System.out.println("Energy cost: ₹" + d.calculateEnergyCost(6));
            System.out.println();
        }
    }
}

