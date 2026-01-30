package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchEmployeeCSV {
    public static void main(String[] args) {

        String filePath = "src/main/resources/employees.csv";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().trim();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                String name = data[1].trim();

                // Case-insensitive match
                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2].trim();
                    String salary = data[3].trim();

                    System.out.println("Employee Found!");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found with name: " + searchName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

