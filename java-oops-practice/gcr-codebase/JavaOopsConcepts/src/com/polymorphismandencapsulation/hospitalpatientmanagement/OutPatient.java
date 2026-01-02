package com.polymorphismandencapsulation.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String medicalRecord;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Bill calculation for out-patient
    
    public double calculateBill() {
        return consultationFee;
    }

    // Medical record methods
    
    public void addRecord(String diagnosis) {
        this.medicalRecord = diagnosis;
    }


    public String viewRecords() {
        return medicalRecord;
    }
}
