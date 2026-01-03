package com.hospitalmanagementsystem;

public class HospitalApp {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Tiwari", "Cardiology");

        Patient p1 = new InPatient(101, "Ankit", "High BP", 5, 2000);
        Patient p2 = new OutPatient(102, "Aryan", 800);

        p1.assignDoctor(d1);
        p2.assignDoctor(d1);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        Bill bill1 = new Bill(((InPatient) p1).getCost());
        Bill bill2 = new Bill(((OutPatient) p2).getCost());

        System.out.println("Final Bill (InPatient): ₹" + bill1.calculatePayment());
        System.out.println("Final Bill (OutPatient): ₹" + bill2.calculatePayment());
    }
}
