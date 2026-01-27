package com.junitpractice;

public class UserRegistration {

    public boolean registerUser(String username, String email, String password) {

        // Username validation
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (username.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters");
        }

        // Email validation
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        // Password validation
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }

        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        if (!hasUpper || !hasDigit) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter and one digit");
        }

        // if all validations passed
        return true;
    }
}
