package com.functionalinterface.vehicledashboard;

interface VehicleDashboard {

	void displaySpeed(int speed);

	// New feature added later (default method)
	default void displayBatteryPercentage(int batteryPercent) {
		System.out.println("Battery info not available for this vehicle.");
	}
}
