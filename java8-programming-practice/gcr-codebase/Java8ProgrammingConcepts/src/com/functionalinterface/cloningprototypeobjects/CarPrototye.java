package com.functionalinterface.cloningprototypeobjects;

class CarPrototype implements Cloneable {

    private String model;
    private String color;
    private int speedLimit;

    public CarPrototype(String model, String color, int speedLimit) {
        this.model = model;
        this.color = color;
        this.speedLimit = speedLimit;
    }

    // cloning method
    @Override
    public CarPrototype clone() {
        try {
            return (CarPrototype) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported!", e);
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "CarPrototype{model='" + model + "', color='" + color + "', speedLimit=" + speedLimit + "}";
    }
}
