package com.polymorphismandencapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	public static void main(String[] args) {

		// Creating patient objects
		Patient p1 = new InPatient(101, "Amit", 35, 5, 2000);
		Patient p2 = new OutPatient(102, "Riya", 28, 800);

		// Add medical records
		((MedicalRecord) p1).addRecord("Admitted for surgery");
		((MedicalRecord) p2).addRecord("General checkup");

		// Store patients in a list (Polymorphism)
		List<Patient> patients = new ArrayList<>();
		patients.add(p1);
		patients.add(p2);

		// Display patient details and bills
		for (Patient patient : patients) {
			System.out.println("\n--- Patient Details ---");
			patient.getPatientDetails();
			System.out.println("Bill Amount: " + patient.calculateBill());
			System.out.println("Medical Record: " + ((MedicalRecord) patient).viewRecords());
		}
	}
}
