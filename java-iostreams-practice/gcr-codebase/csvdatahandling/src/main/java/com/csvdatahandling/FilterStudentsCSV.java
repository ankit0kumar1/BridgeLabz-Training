package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterStudentsCSV {
    public static void main(String[] args) {

        String filePath = "src/main/resources/studentsmarks.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read & skip header
            String header = br.readLine();
            System.out.println("Filtering students with Marks > 80");
            System.out.println("-------------------------------------------");
            System.out.printf("%-5s %-10s %-5s %-5s%n", "ID", "Name", "Age", "Marks");
            System.out.println("-------------------------------------------");

            String line;

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                double marks = Double.parseDouble(data[3].trim());

                if (marks > 80) {
                    System.out.printf("%-5d %-10s %-5d %-5.1f%n", id, name, age, marks);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

