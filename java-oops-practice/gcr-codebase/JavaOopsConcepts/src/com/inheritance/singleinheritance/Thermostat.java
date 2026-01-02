package com.inheritance.singleinheritance;

public class Thermostat extends Device{
	private int temperature;

	public Thermostat(int deviceId, boolean status, int temperature) {
		super(deviceId, status);
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	@Override
	public void displayStatus() {
	
		super.displayStatus();
		System.out.println("Temperature Setting: " + temperature + "°C");
	}
	

}
