package com.functionalinterface.rentalsystem;

class Bike implements RentalVehicle {
    @Override
    public void rent() {
        System.out.println("Bike rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
}