package com.objectmodeling.level1.hospitalmanagement;

import java.util.*;
public class Patient {
	private String patientName;
	private int patientId;
	List<Doctor> doctors;
	
	//Constructor
	public Patient(String patientName, int patientId) {
		this.patientName = patientName;
		this.patientId = patientId;
		this.doctors = new ArrayList<>();
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	
	// method to show patient details
	public void showPatientDetails() {
		System.out.println("Patient Name: " + patientName + ":");
		System.out.println("Doctors consulted: ");
		for(Doctor d : doctors) {
			System.out.println("-" + d.getDoctorName());
		}
	}
}
