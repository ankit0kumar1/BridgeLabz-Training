package com.csvdatahandling.convert;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.util.List;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


import java.io.FileWriter;
import java.util.ArrayList;


public class JsonCsvConverter {

    public static void main(String[] args) {

        String jsonInput = "src/main/resources/students.json";
        String csvOutput = "src/main/resources/students_converted.csv";
        String jsonOutput = "src/main/resources/students_from_csv.json";

        jsonToCsv(jsonInput, csvOutput);
        csvToJson(csvOutput, jsonOutput);
    }

    // ✅ JSON -> CSV
    public static void jsonToCsv(String jsonFilePath, String csvFilePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Student> students = mapper.readValue(
                    new FileReader(jsonFilePath),
                    new TypeReference<List<Student>>() {}
            );

            try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {

                // Write header
                writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});

                // Write records
                for (Student s : students) {
                    writer.writeNext(new String[]{
                            String.valueOf(s.getId()),
                            s.getName(),
                            String.valueOf(s.getAge()),
                            String.valueOf(s.getMarks())
                    });
                }
            }

            System.out.println("JSON -> CSV Done: " + csvFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ CSV -> JSON
    public static void csvToJson(String csvFilePath, String jsonFilePath) {
        try {
            List<Student> students = new ArrayList<>();

            try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {

                // skip header
                reader.readNext();

                String[] row;
                while ((row = reader.readNext()) != null) {

                    int id = Integer.parseInt(row[0].trim());
                    String name = row[1].trim();
                    int age = Integer.parseInt(row[2].trim());
                    double marks = Double.parseDouble(row[3].trim());

                    students.add(new Student(id, name, age, marks));
                }
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new java.io.File(jsonFilePath), students);

            System.out.println("CSV -> JSON Done: " + jsonFilePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

