package com.functionalinterface.unitconverter;

public class Main {
    public static void main(String[] args) {

        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("5 miles = " + UnitConverter.milesToKm(5) + " km");

        System.out.println("70 kg = " + UnitConverter.kgToLbs(70) + " lbs");
        System.out.println("154 lbs = " + UnitConverter.lbsToKg(154) + " kg");
    }
}
