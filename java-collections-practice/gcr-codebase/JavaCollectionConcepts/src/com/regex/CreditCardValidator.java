package com.regex;

public class CreditCardValidator {
    public static void main(String[] args) {
        String[] cards = {
            "4123456789012345",  // Visa
            "5123456789012345",  // MasterCard
            "6123456789012345",  // Invalid
            "41234",             // Invalid
            "512345678901234"    // Invalid (15 digits)
        };

        String regex = "^(4\\d{15}|5\\d{15})$";

        for (String card : cards) {
            System.out.println(card + " -> " + (card.matches(regex) ? "Valid" : "Invalid"));
        }
    }
}

