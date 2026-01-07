package com.eventease;

import java.time.LocalDate;
import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to EventEase – Event Management Platform ");

        // Organizer details
        System.out.print("Enter Organizer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Organizer Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Organizer Phone: ");
        String phone = sc.nextLine();

        User organizer = new User(name, email, phone);

        // Event details
        System.out.println("\nChoose Event Type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Event Date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Number of Attendees: ");
        int attendees = sc.nextInt();

        Event event = null;

        // Polymorphic object creation
        switch (choice) {
            case 1:
                event = new BirthdayEvent(eventName, location, date, attendees, organizer);
                break;

            case 2:
                event = new ConferenceEvent(eventName, location, date, attendees, organizer);
                break;

            default:
                System.out.println("Invalid choice. Exiting...");
                sc.close();
                return;
        }

        // Menu loop
        while (true) {
            System.out.println("\n📋 Event Menu");
            System.out.println("1. Schedule Event");
            System.out.println("2. Reschedule Event");
            System.out.println("3. Cancel Event");
            System.out.println("4. View Event Details");
            System.out.println("5. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    event.schedule();
                    break;

                case 2:
                    System.out.print("Enter New Date (yyyy-mm-dd): ");
                    LocalDate newDate = LocalDate.parse(sc.nextLine());
                    event.reschedule(newDate);
                    break;

                case 3:
                    event.cancel();
                    break;

                case 4:
                    System.out.println("\n📊 Event Details:");
                    System.out.println("Event ID: " + event.getEventId());
                    System.out.println("Event Date: " + event.getDate());
                    System.out.println("Total Cost: ₹" + event.getTotalCost());
                    break;

                case 5:
                    System.out.println("👋 Thank you for using EventEase!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}