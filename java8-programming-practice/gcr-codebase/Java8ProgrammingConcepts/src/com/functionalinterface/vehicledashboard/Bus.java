package com.functionalinterface.vehicledashboard;

//Another normal vehicle
class Bus implements VehicleDashboard {

	@Override
	public void displaySpeed(int speed) {
		System.out.println("Bus Speed: " + speed + " km/h");
	}
}
