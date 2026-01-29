package com.csvdatahandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {
    public static void main(String[] args) {

        String filePath = "src/main/resources/employees.csv";

        // Employee data
        String[][] employees = {
                {"201", "Ankit Kumar", "IT", "45000"},
                {"202", "Rahul Sharma", "HR", "38000"},
                {"203", "Priya Singh", "Finance", "52000"},
                {"204", "Amit Verma", "Marketing", "41000"},
                {"205", "Neha Gupta", "Sales", "47000"}
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            // header
            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            // records
            for (String[] emp : employees) {
                bw.write(emp[0] + "," + emp[1] + "," + emp[2] + "," + emp[3]);
                bw.newLine();
            }

            System.out.println("Employee CSV created successfully at: " + filePath);

        } catch (IOException e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }
}

