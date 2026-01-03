package com.vehiclerentalsystem;

public class RentalApp {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Ankit");

        Vehicle bike = new Bike("B101", "Yamaha", 300);
        Vehicle car = new Car("C201", "Honda", 1500, 1000);
        Vehicle truck = new Truck("T301", "Tata", 2500, 2000);

        c1.rentVehicle(bike, 3);
        c1.rentVehicle(car, 2);
        c1.rentVehicle(truck, 1);
    }
}
