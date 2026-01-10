package com.artify;

import java.util.Scanner;

public class ArtifyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to Artify =====");

        // User details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); // consume newline

        User user = new User(name, balance);

        // Artwork details
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter artwork price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter artwork type (Digital / Print): ");
        String type = sc.nextLine();

        ArtWork artwork;

        // Polymorphic object creation
        if (type.equalsIgnoreCase("Digital")) {
            artwork = new DigitalArt(title, artist, price);
        } else if (type.equalsIgnoreCase("Print")) {
            artwork = new PrintArt(title, artist, price);
        } else {
            System.out.println("Invalid artwork type.");
            sc.close();
            return;
        }

     
        System.out.println("\n--- Processing Purchase ---");
        artwork.purchase(user);

        System.out.println("\n===== Thank you for using Artify =====");
        sc.close();
    }
}
