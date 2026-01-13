package com.homenest;

class Light extends Device {

    public Light(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        energyUsage += 0.5;
        System.out.println("Light " + deviceId + " turned ON");
    }

    @Override
    public void reset() {
        energyUsage = 0;
        System.out.println("Light " + deviceId + " reset: brightness calibrated");
    }
}

