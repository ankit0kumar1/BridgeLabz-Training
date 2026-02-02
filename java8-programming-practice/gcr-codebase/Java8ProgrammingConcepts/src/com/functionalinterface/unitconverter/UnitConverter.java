package com.functionalinterface.unitconverter;

interface UnitConverter {

    // Constants
    double KM_TO_MILES = 0.621371;
    double KG_TO_LBS = 2.20462;

    // Distance conversions
    static double kmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    static double milesToKm(double miles) {
        return miles / KM_TO_MILES;
    }

    // Weight conversions
    static double kgToLbs(double kg) {
        return kg * KG_TO_LBS;
    }

    static double lbsToKg(double lbs) {
        return lbs / KG_TO_LBS;
    }
}
