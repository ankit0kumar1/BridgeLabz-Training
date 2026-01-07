package com.petpal;

import java.util.*;
public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println(" Welcome to PetPal – Virtual Pet Care App 🐾");

        //choose pet type
        System.out.println("Choose a pet to adopt:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        // Pet name
        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        // Pet age
        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

       
        switch (choice) {
            case 1:
                pet = new Dog(name, age);
                break;
            case 2:
                pet = new Cat(name, age);
                break;
            case 3:
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                sc.close();
                return;
        }

        System.out.println(" You adopted " + name + "!");
        pet.makeSound();

        // Interaction loop
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Check Status");
            System.out.println("5. Exit");

            int action = sc.nextInt();

            switch (action) {
                case 1:
                    pet.feed();
                    System.out.println(name + " has been fed.");
                    break;
                case 2:
                    pet.play();
                    System.out.println(name + " enjoyed playing!");
                    break;
                case 3:
                    pet.sleep();
                    System.out.println(name + " is sleeping peacefully.");
                    break;
                case 4:
                    System.out.println("\n Pet Status:");
                    System.out.println("Hunger Level : " + pet.getHungerLevel());
                    System.out.println("Energy Level : " + pet.getEnergyLevel());
                    System.out.println("Mood Level   : " + pet.getMoodLevel());
                    break;
                case 5:
                    System.out.println("Thanks for using PetPal!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
