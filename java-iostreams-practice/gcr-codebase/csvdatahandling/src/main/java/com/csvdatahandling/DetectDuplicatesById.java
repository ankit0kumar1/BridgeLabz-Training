package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class DetectDuplicatesById {

    public static void main(String[] args) {

        String filePath = "src/main/resources/students.csv";

        // Step 1: Count IDs
        Map<String, Integer> idCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // skip header
            br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");
                String id = data[0].trim();

                idCountMap.put(id, idCountMap.getOrDefault(id, 0) + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Step 2: Print duplicate records
        System.out.println("Duplicate Records (based on ID):");
    

        boolean foundDuplicate = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String header = br.readLine();
            System.out.println(header);

            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");
                String id = data[0].trim();

                if (idCountMap.get(id) > 1) {
                    System.out.println(line);
                    foundDuplicate = true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}
