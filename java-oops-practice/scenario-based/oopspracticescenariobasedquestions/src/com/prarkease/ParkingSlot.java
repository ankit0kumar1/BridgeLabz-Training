package com.prarkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {

	private int slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;

	// internal booking records
	private List<String> bookingLogs;

	public ParkingSlot(int slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
		this.bookingLogs = new ArrayList<>();
	}

	public boolean assignSlot(Vehicle vehicle) {

		if (isOccupied) {
			return false;
		}

		if (!vehicle.getVehicleType().equalsIgnoreCase(vehicleTypeAllowed)) {
			return false;
		}

		isOccupied = true;
		bookingLogs.add("Slot " + slotId + " booked for vehicle " + vehicle.getVehicleNumber());
		return true;
	}

	public void releaseSlot() {
		if (!isOccupied) {
			return;
		}
		isOccupied = false;
		bookingLogs.add("Slot " + slotId + " released.");
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public void showLogs() {
		System.out.println("\n--- Booking Logs ---");
		for (String log : bookingLogs) {
			System.out.println(log);
		}
	}
}
