package com.filehandling.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

    public static void main(String[] args) {

        String filePath = "D:/sample.txt";   // file to read
        String targetWord = "Ankit";       // word to count
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            while ((line = br.readLine()) != null) {
                // split line into words using space and punctuation
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

