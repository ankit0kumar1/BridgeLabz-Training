package com.streamapi.hospitaldoctoravailablity;


public class Doctor {
	private String name;
	private String speciality;
	private boolean isAvailableOnWeekend;
	
	public Doctor(String name, String speciality, boolean isAvailableOnWeekend) {
		this.name = name;
		this.speciality = speciality;
		this.isAvailableOnWeekend = isAvailableOnWeekend;
	}

	public String getName() {
		return name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public boolean isAvailableOnWeekend() {
		return isAvailableOnWeekend;
	}
	
	@Override
	public String toString() {
		return name + "| Speciality: " + speciality + "| Available on weekends: " + isAvailableOnWeekend;
	}
}
