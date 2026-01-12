package com.ambulanceroute;

import java.util.Scanner;

public class AmbulanceRouteApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        while (true) {
            System.out.println("\n--- Ambulance Route Menu ---");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Find Nearest Available Unit");
            System.out.println("3. Remove Unit (Maintenance)");
            System.out.println("4. Display Hospital Route");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter unit name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available? (true/false): ");
                    boolean available = sc.nextBoolean();

                    route.addUnit(name, available);
                    break;

                case 2:
                    route.findNearestAvailableUnit();
                    break;

                case 3:
                    System.out.print("Enter unit name to remove: ");
                    route.removeUnit(sc.nextLine());
                    break;

                case 4:
                    route.displayRoute();
                    break;

                case 5:
                    System.out.println("System shutting down.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
