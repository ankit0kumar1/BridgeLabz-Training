package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UpdateSalaryCSV {
    public static void main(String[] args) {

        String inputFile = "src/main/resources/employees.csv";
        String outputFile = "src/main/resources/employees_updated.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // read & write header
            String header = br.readLine();
            bw.write(header);
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                String id = data[0].trim();
                String name = data[1].trim();
                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                // increase IT salary by 10%
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // write updated record
                bw.write(id + "," + name + "," + department + "," + String.format("%.2f", salary));
                bw.newLine();
            }

            System.out.println("Updated CSV created successfully: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

