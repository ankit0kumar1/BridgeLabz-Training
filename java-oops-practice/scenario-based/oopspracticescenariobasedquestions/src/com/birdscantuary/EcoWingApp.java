package com.birdscantuary;

import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BirdSanctuary sanctuary = new BirdSanctuary();

        int choice;

        do {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display All Flying Birds");
            System.out.println("4. Display All Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bird ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Bird Name: ");
                    String name = sc.nextLine();

                    System.out.println("Select Bird Type:");
                    System.out.println("1. Eagle");
                    System.out.println("2. Duck");
                    System.out.println("3. Penguin");
                    System.out.println("4. Kiwi");
                    int type = sc.nextInt();

                    switch (type) {
                        case 1:
                            sanctuary.addBird(new Eagle(id, name));
                            break;
                        case 2:
                            sanctuary.addBird(new Duck(id, name));
                            break;
                        case 3:
                            sanctuary.addBird(new Penguin(id, name));
                            break;
                        case 4:
                            sanctuary.addBird(new Kiwi(id, name));
                            break;
                        default:
                            System.out.println("Invalid bird type.");
                    }
                    break;

                case 2:
                    sanctuary.displayAllBirds();
                    break;

                case 3:
                    sanctuary.displayFlyingBirds();
                    break;

                case 4:
                    sanctuary.displaySwimmingBirds();
                    break;

                case 5:
                    sanctuary.displayBothFlyAndSwim();
                    break;

                case 6:
                    System.out.print("Enter Bird ID to delete: ");
                    String deleteId = sc.nextLine();
                    sanctuary.removeBirdById(deleteId);
                    break;

                case 7:
                    sanctuary.sanctuaryReport();
                    break;

                case 8:
                    System.out.println("Exiting EcoWing Sanctuary System.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}

