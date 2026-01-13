package com.homenest;

class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        energyUsage += 0.2;
        System.out.println("Lock " + deviceId + " secured");
    }

    @Override
    public void reset() {
        System.out.println("Lock " + deviceId + " reset: security keys refreshed");
    }
}

