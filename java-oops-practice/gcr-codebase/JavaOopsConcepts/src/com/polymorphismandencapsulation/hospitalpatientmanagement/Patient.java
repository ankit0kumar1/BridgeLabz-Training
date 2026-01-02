package com.polymorphismandencapsulation.hospitalpatientmanagement;

public abstract class Patient {

    // Encapsulated fields
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method for bill calculation
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + name);
        System.out.println("Age          : " + age);
    }

    // Getters (Encapsulation)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }
}
