package com.linkedlist;

public class OnlineTicketReservationApp {
    public static void main(String[] args) {

        TicketCircularLinkedList tickets = new TicketCircularLinkedList();

        tickets.addTicket(101, "Ankit", "Inception", "A1", "10:30 AM");
        tickets.addTicket(102, "Riya", "Inception", "A2", "10:30 AM");
        tickets.addTicket(103, "Rahul", "Interstellar", "B5", "1:00 PM");

        tickets.displayTickets();

        System.out.println();
        tickets.searchByCustomerName("Riya");

        System.out.println();
        tickets.searchByMovieName("Inception");

        System.out.println("\nTotal Tickets Booked: " + tickets.countTickets());

        System.out.println("\nRemoving Ticket ID 102");
        tickets.removeTicket(102);

        System.out.println();
        tickets.displayTickets();
    }
}

