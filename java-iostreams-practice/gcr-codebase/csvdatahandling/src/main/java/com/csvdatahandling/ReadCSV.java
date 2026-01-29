package com.csvdatahandling;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCSV {
    public static void main(String[] args) {

        String filePath = "src/main/resources/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {

            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {
                for (String col : row) {
                    System.out.print(col + "  ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
