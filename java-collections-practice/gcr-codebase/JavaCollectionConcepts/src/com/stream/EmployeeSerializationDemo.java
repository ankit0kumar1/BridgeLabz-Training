package com.stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationDemo {

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        // 1) Create employee list
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "IT", 55000));
        employees.add(new Employee(102, "Riya", "HR", 45000));
        employees.add(new Employee(103, "Ankit", "Finance", 60000));

        // 2) Serialize the employee list
        serializeEmployees(employees);

        // 3) Deserialize and display
        List<Employee> loadedEmployees = deserializeEmployees();
        if (loadedEmployees != null) {
            System.out.println("---- Employees loaded from file ----");
            for (Employee emp : loadedEmployees) {
                System.out.println(emp);
            }
        }
    }

    // Serialize method
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees saved successfully into file: " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("IOException occurred while saving: " + e.getMessage());
        }
    }

    // Deserialize method
    private static List<Employee> deserializeEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Employee>) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("IOException occurred while reading: " + e.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }

        return null;
    }
}

