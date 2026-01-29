package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountEmployeesRows {
    public static void main(String[] args) {

        String filePath = "src/main/resources/employees.csv";

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Skip header row
            String header = br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {  // ignore blank lines
                    count++;
                }
            }

            System.out.println("Header: " + header);
            System.out.println("Total records (excluding header): " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

