package com.regex;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeats = new LinkedHashSet<>();

        while (matcher.find()) {
            repeats.add(matcher.group(1)); // the repeated word
        }

        System.out.println(repeats);
    }
}

