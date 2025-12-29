package com.consturctors.level1;

public class Vehicle{
	private String ownerName;
	private String vehicleType;
	
	public static double registrationFee = 9999;
	Vehicle(String ownerName , String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails() {
		System.out.println("The name of owner is: "+ownerName +". The vehicle type is: "+vehicleType);
	}
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Ankit", "four wheeler");
		v1.displayVehicleDetails();
		updateRegistrationFee(12999);
	}
}