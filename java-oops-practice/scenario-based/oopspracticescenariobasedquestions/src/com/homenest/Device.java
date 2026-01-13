package com.homenest;

abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;          // encapsulated
    protected double energyUsage;    // kWh

    protected Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0.0;
        logFirmwareUpdate("Device registered");
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateEnergyCost(double ratePerUnit) {
        return energyUsage * ratePerUnit;
    }

    // Secure firmware logs
    private void logFirmwareUpdate(String message) {
        System.out.println("[Firmware Log][" + deviceId + "] " + message);
    }

    @Override
    public void turnOn() {
        setStatus(true);
    }

    @Override
    public void turnOff() {
        setStatus(false);
    }
}

