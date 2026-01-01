package com.objectmodeling.level1.hospitalmanagement;

import java.util.*;
public class Hospital {
	private String hospitalName;
	List<Doctor> doctors;
	List<Patient>patients;
	
	//Constructor
	public Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
		this.doctors = new ArrayList<>();
		this.patients = new ArrayList<>();
	}
	public String getHospitalName() {
		return hospitalName;
	}
	
	//method to add doctors in hospital
	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	public  void showHospitalDetails() {
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Number of Doctors: " + doctors.size());
		System.out.println("Number of Patients : " + patients.size());
	}
	
}
