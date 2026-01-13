package com.homenest;

class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        energyUsage += 1.2;
        System.out.println("Camera " + deviceId + " recording started");
    }

    @Override
    public void reset() {
        System.out.println("Camera " + deviceId + " reset: storage cleared");
    }
}

