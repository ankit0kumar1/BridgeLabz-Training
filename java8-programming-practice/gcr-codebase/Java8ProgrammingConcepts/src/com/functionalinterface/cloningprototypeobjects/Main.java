package com.functionalinterface.cloningprototypeobjects;

public class Main {
    public static void main(String[] args) {

        // Prototype object (predefined model)
        CarPrototype baseCar = new CarPrototype("Tesla Model 3", "White", 180);

        // Clone prototype to create new object
        CarPrototype car1 = baseCar.clone();
        car1.setColor("Red");

        CarPrototype car2 = baseCar.clone();
        car2.setSpeedLimit(200);

        System.out.println("Base Prototype: " + baseCar);
        System.out.println("Clone 1: " + car1);
        System.out.println("Clone 2: " + car2);
    }
}
