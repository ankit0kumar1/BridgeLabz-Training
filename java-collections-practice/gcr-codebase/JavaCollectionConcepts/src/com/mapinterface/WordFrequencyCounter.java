package com.mapinterface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String filePath = "data.txt";   // change file name/path if needed

        Map<String, Integer> freqMap = countWordFrequency(filePath);

        System.out.println(freqMap);
    }

    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                // convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

                // split words by spaces
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;

                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }
}

