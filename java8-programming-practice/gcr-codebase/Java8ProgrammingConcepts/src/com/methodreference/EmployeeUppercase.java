package com.methodreference;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUppercase {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList("ankit", "rohan", "neha", "priya");

        List<String> upperNames = employees.stream()
                .map(String::toUpperCase)   // Method Reference
                .collect(Collectors.toList());

        System.out.println("Uppercase Names:");
        upperNames.forEach(System.out::println);
    }
}

