package com.eventmanager;

public class EventManagerApp {
    public static void main(String[] args) {
        Ticket[] tickets = {
            new Ticket(101, 2500.0, "ConcertA"),
            new Ticket(102, 1200.0, "ConcertB"),
            new Ticket(103, 5000.0, "ConcertC"),
            new Ticket(104, 1800.0, "ConcertA"),
            new Ticket(105, 900.0, "ConcertD")
        };

        System.out.println("Before Sorting:");
        for (Ticket t : tickets) {
            t.display();
        }

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        for (Ticket t : tickets) {
            t.display();
        }

        System.out.println("\nTop 2 Cheapest Tickets:");
        for (int i = 0; i < 2; i++) {
            tickets[i].display();
        }
    }
}
