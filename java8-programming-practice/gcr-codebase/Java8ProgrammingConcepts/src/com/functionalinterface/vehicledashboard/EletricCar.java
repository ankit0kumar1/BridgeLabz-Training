package com.functionalinterface.vehicledashboard;

//Electric Vehicle (EV)
class ElectricCar implements VehicleDashboard {

	@Override
	public void displaySpeed(int speed) {
		System.out.println("Electric Car Speed: " + speed + " km/h");
	}

	// override default method for EV
	@Override
	public void displayBatteryPercentage(int batteryPercent) {
		System.out.println("Battery: " + batteryPercent + "%");
	}
}
