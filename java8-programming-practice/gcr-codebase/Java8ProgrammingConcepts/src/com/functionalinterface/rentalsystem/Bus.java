package com.functionalinterface.rentalsystem;

class Bus implements RentalVehicle {
    @Override
    public void rent() {
        System.out.println("Bus rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}
