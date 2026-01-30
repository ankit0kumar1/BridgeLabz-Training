package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateCSVData {

    // Email Regex (simple + practical)
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    // Phone Regex: exactly 10 digits
    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {

        String filePath = "src/main/resources/users.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read header
            String header = br.readLine();
            System.out.println("Header: " + header);
            System.out.println("--------------------------------------------------");

            String line;
            int rowNumber = 1; // header is row 1

            while ((line = br.readLine()) != null) {
                rowNumber++;

                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                // Basic column check
                if (data.length < 4) {
                    System.out.println("❌ Row " + rowNumber + " Invalid: Missing columns -> " + line);
                    continue;
                }

                String id = data[0].trim();
                String name = data[1].trim();
                String email = data[2].trim();
                String phone = data[3].trim();

                boolean valid = true;
                StringBuilder error = new StringBuilder();

                // Validate email
                if (!EMAIL_PATTERN.matcher(email).matches()) {
                    valid = false;
                    error.append("Invalid Email format; ");
                }

                // Validate phone
                if (!PHONE_PATTERN.matcher(phone).matches()) {
                    valid = false;
                    error.append("Phone must be exactly 10 digits; ");
                }

                if (!valid) {
                    System.out.println("Invalid Row " + rowNumber + ": " + error);
                    System.out.println("   Data -> ID=" + id + ", Name=" + name + ", Email=" + email + ", Phone=" + phone);
                }
            }

            System.out.println("--------------------------------------------------");
            System.out.println("Validation completed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
