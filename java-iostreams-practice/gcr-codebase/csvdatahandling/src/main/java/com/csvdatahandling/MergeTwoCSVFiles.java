package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoCSVFiles {

    public static void main(String[] args) {

        String file1 = "src/main/resources/students1.csv";
        String file2 = "src/main/resources/students2.csv";
        String outputFile = "src/main/resources/students_merged.csv";

        // Map<ID, MarksAndGrade>
        Map<Integer, String[]> marksMap = new HashMap<>();

        try (
                BufferedReader br2 = new BufferedReader(new FileReader(file2))
        ) {
            // Skip header of students2
            br2.readLine();

            String line;
            while ((line = br2.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String marks = data[1].trim();
                String grade = data[2].trim();

                marksMap.put(id, new String[]{marks, grade});
            }

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Now read students1 and merge
        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Skip header of students1
            br1.readLine();

            // Write new header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            String line;
            while ((line = br1.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String age = data[2].trim();

                String[] marksGrade = marksMap.get(id);

                if (marksGrade != null) {
                    bw.write(id + "," + name + "," + age + "," + marksGrade[0] + "," + marksGrade[1]);
                } else {
                    // if no match found in students2
                    bw.write(id + "," + name + "," + age + ",NA,NA");
                }

                bw.newLine();
            }

            System.out.println("Merge completed!");
            System.out.println("Output file created: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

