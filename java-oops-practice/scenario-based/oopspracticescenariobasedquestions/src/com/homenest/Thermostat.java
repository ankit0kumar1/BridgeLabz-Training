package com.homenest;

class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        energyUsage += 2.0;
        System.out.println("Thermostat " + deviceId + " regulating temperature");
    }

    @Override
    public void reset() {
        System.out.println("Thermostat " + deviceId + " reset: default temperature set");
    }
}

