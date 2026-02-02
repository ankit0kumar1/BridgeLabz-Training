package com.functionalinterface.dateformatutility;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        System.out.println("Default: " + invoiceDate);

        System.out.println("dd-MM-yyyy: " + DateUtils.formatDate(invoiceDate, "dd-MM-yyyy"));
        System.out.println("yyyy/MM/dd: " + DateUtils.formatDate(invoiceDate, "yyyy/MM/dd"));
        System.out.println("dd MMM yyyy: " + DateUtils.formatDate(invoiceDate, "dd MMM yyyy"));
    }
}
