package com.prarkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create parking slots
        ParkingSlot carSlot = new ParkingSlot(101, "Car");
        ParkingSlot bikeSlot = new ParkingSlot(102, "Bike");
        ParkingSlot truckSlot = new ParkingSlot(103, "Truck");

        System.out.println(" Welcome to ParkEase ");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Type (Car / Bike / Truck): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Parking Duration (in hours): ");
        int hours = sc.nextInt();

        Vehicle vehicle = null;
        ParkingSlot assignedSlot = null;

        //creating vehicle based on user input
        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(vehicleNumber);
            assignedSlot = carSlot;
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(vehicleNumber);
            assignedSlot = bikeSlot;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck(vehicleNumber);
            assignedSlot = truckSlot;
        } else {
            System.out.println("Invalid vehicle type.");
            sc.close();
            return;
        }

        //assign slot
        if (assignedSlot.assignSlot(vehicle)) {
            System.out.println("Vehicle parked successfully in slot " + vehicleType);
        } else {
            System.out.println("Parking failed. Slot unavailable or incompatible.");
            sc.close();
            return;
        }

        // Calculate charges 
        double charges = vehicle.calculateCharges(hours);
        System.out.println("Total parking charges: ₹" + charges);

        // Release slot
        System.out.print("Release slot? (yes/no): ");
        sc.nextLine(); // consume newline
        String releaseChoice = sc.nextLine();

        if (releaseChoice.equalsIgnoreCase("yes")) {
            assignedSlot.releaseSlot();
            System.out.println("Slot released successfully.");
        }

        // Show booking logs
        assignedSlot.showLogs();

        System.out.println("===== Thank you for using ParkEase =====");
        sc.close();
    }
}
