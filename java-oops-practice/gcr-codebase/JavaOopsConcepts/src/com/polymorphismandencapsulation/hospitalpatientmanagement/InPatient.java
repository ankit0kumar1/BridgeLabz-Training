package com.polymorphismandencapsulation.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {

	private int numberOfDays;
	private double dailyCharge;
	private String medicalRecord;

	public InPatient(int patientId, String name, int age, int numberOfDays, double dailyCharge) {
		super(patientId, name, age);
		this.numberOfDays = numberOfDays;
		this.dailyCharge = dailyCharge;
	}

	// Bill calculation for in-patient
	@Override
	public double calculateBill() {
		return numberOfDays * dailyCharge;
	}

	// Medical record methods
	@Override
	public void addRecord(String diagnosis) {
		this.medicalRecord = diagnosis;
	}

	@Override
	public String viewRecords() {
		return medicalRecord;
	}
}
