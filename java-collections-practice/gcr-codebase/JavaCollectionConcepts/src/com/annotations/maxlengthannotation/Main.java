package com.annotations.maxlengthannotation;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Ankit");   //  valid
        System.out.println("Username: " + u1.getUsername());

        User u2 = new User("AnkitKumar123");  //  invalid
        System.out.println("Username: " + u2.getUsername());
    }
}
