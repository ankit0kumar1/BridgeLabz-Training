package com.methodreference;

import java.util.*;

public class HospitalPatientIdPrint {
    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(101, 205, 309, 412, 550);

        System.out.println("Patient IDs:");

        // Method Reference instead of Lambda
        patientIds.forEach(System.out::println);
    }
}
