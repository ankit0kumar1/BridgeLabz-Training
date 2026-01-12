package com.stringbuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();   // takes full line including spaces

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}

