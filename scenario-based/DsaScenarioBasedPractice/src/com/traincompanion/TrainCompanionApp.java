package com.traincompanion;

import java.util.Scanner;

public class TrainCompanionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        while (true) {
            System.out.println("\n--- Train Companion Menu ---");
            System.out.println("1. Add Compartment");
            System.out.println("2. Remove Compartment");
            System.out.println("3. Move Forward");
            System.out.println("4. Move Backward");
            System.out.println("5. Show Current & Adjacent Compartments");
            System.out.println("6. Search for Service");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter compartment name: ");
                    train.addCompartment(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter compartment name to remove: ");
                    train.removeCompartment(sc.nextLine());
                    break;

                case 3:
                    train.moveForward();
                    break;

                case 4:
                    train.moveBackward();
                    break;

                case 5:
                    train.showCurrent();
                    break;

                case 6:
                    System.out.print("Enter service name (pantry/WiFi): ");
                    train.searchCompartment(sc.nextLine());
                    break;

                case 7:
                    System.out.println("Exiting Train Companion.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
