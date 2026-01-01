package com.objectmodeling.level1.hospitalmanagement;

public class RunHospital {
	public static void main(String[] args) {
		Hospital h1 = new Hospital("Sadar Hospital");
		Doctor d1 = new Doctor("Ankit", "Cardiologist");
		Doctor d2 = new Doctor("Keshav", "Neurologist");
		Doctor d3 = new Doctor("Nitya Pandey", "Dermatologist");
		
		Patient p1 = new Patient("Sanchit", 101);
		Patient p2 = new Patient("Anupum", 107);
		Patient p3 = new Patient("Divyansh", 307);
		
		h1.addDoctor(d1);
		h1.addDoctor(d2);
		h1.addDoctor(d3);
		h1.addPatient(p3);
		h1.addPatient(p2);
		h1.addPatient(p1);
		d1.consult(p3);
		d1.consult(p2);
		d2.consult(p1);
		d2.consult(p2);
		d3.consult(p1);
		
		System.out.println();
		p1.showPatientDetails();
		System.out.println();
		p2.showPatientDetails();
		System.out.println();
		h1.showHospitalDetails();
		System.out.println();
		d1.showDoctorDetails();
		
	}
}
