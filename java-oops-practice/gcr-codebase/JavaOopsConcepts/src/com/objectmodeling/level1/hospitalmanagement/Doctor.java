package com.objectmodeling.level1.hospitalmanagement;

import java.util.*;
public class Doctor {
	private String doctorName;
	private String specialization;
	List<Patient> patients;
	
	//Constructor
	public Doctor(String doctorName, String specialization) {
		
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.patients = new ArrayList<>();
		
	}
	// method to add patients to doctors
	public void consult(Patient patient) {
		System.out.println("Doctor "+ doctorName + " is consulting patient " + patient.getPatientName());
		patients.add(patient); 
		patient.addDoctor(this);
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public void showDoctorDetails() {
		System.out.println("Doctor's Name: " + doctorName);
		System.out.println("Specialization: " + specialization);
		System.out.println("Patients Consulting: ");
		for(Patient p : patients) {
			System.out.println("-" + p.getPatientName());
		}
		
	}
	
}
