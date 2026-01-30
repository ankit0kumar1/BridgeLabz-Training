package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {
    public static void main(String[] args) {

        String filePath = "src/main/resources/studentsmarks.csv";

        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                double marks = Double.parseDouble(data[3].trim());

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print list of Student objects
        System.out.println("Student Objects List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

