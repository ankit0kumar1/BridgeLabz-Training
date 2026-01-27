package com.regex;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        // Build regex: \b(word1|word2|word3)\b
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        String censored = text.replaceAll(regex, "****");

        System.out.println(censored);
    }
}

