package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Top5HighestPaidEmployees {
    public static void main(String[] args) {

        String filePath = "src/main/resources/employees.csv";
        List<Employee> employees = new ArrayList<>();

        // 1) Read CSV
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String department = data[2].trim();
                double salary = Double.parseDouble(data[3].trim());

                employees.add(new Employee(id, name, department, salary));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // 2) Sort by Salary (Descending)
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        // 3) Print Top 5
        System.out.println("Top 5 Highest-Paid Employees (Salary Desc)");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-5s %-15s %-12s %-10s%n", "ID", "Name", "Dept", "Salary");
        System.out.println("----------------------------------------------------------");

        int limit = Math.min(5, employees.size());

        for (int i = 0; i < limit; i++) {
            Employee emp = employees.get(i);
            System.out.printf("%-5d %-15s %-12s %-10.2f%n",
                    emp.getId(),
                    emp.getName(),
                    emp.getDepartment(),
                    emp.getSalary());
        }
    }
}

