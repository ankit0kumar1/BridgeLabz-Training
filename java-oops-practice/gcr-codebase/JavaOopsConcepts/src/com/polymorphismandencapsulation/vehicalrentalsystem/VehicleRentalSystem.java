package com.polymorphismandencapsulation.vehicalrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {

	public static void main(String[] args) {

		// List of Vehicle references (Polymorphism)
		List<Vehicle> vehicles = new ArrayList<>();

		vehicles.add(new Car("MP09-CA-1234", 2000, "CAR987654"));
		vehicles.add(new Bike("MP09-BI-5678", 500, "BIKE123456"));
		vehicles.add(new Truck("MP09-TR-9999", 4000, "TRUCK456789"));

		int rentalDays = 3;

		// Iterating over vehicles
		for (Vehicle v : vehicles) {

			System.out.println("Vehicle Type : " + v.getType());
			System.out.println("Vehicle No   : " + v.getVehicleNumber());
			System.out.println("Rental Cost  : " + v.calculateRentalCost(rentalDays));

			// Insurance calculation using interface
			Insurable ins = (Insurable) v;
			System.out.println("Insurance    : " + ins.calculateInsurance());
			System.out.println(ins.getInsuranceDetails());

			System.out.println("----------------------------------");
		}
	}
}
