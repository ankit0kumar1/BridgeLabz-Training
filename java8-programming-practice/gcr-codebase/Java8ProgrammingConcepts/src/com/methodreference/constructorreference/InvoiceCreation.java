package com.methodreference.constructorreference;

import java.util.*;
import java.util.stream.Collectors;

public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN101", "TXN205", "TXN309");

        // Constructor Reference
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // ✅ Constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

