package com.junitpractice;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) return false;

        // at least 8 chars
        if (password.length() < 8) return false;

        // at least one uppercase letter
        boolean hasUpper = false;

        // at least one digit
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpper && hasDigit;
    }
}
