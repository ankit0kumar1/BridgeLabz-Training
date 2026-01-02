package com.inheritance.singleinheritance;

public class SmartHome {
 public static void main(String[] args) {
	Thermostat thermostat = new Thermostat(120, true, 24);
	thermostat.displayStatus();
}
}
