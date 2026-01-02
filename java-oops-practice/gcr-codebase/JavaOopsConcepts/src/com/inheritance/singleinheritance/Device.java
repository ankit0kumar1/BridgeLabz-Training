package com.inheritance.singleinheritance;

//superclass
public class Device {
	protected int deviceId;
	protected boolean status;
	
	public Device(int deviceId, boolean status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	public void displayStatus() {
		System.out.println("Device id: " +deviceId);
		if(status) {
			System.out.println("Device Status: " + "ON");
		}else {
			System.out.println("Device Status: " + "OFF");
		}
		
	}
}
