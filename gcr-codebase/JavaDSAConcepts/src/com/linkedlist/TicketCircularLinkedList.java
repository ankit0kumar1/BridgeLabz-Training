package com.linkedlist;

class TicketCircularLinkedList {

    private TicketNode head;

    /* ========== ADD TICKET AT END ========== */

    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /* ========== REMOVE TICKET BY ID ========== */

    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == ticketId) {

                // Only one ticket
                if (curr == head && curr.next == head) {
                    head = null;
                }
                // Removing head
                else if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Removing middle or last
                else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed successfully");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found");
    }

    /* ========== DISPLAY ALL TICKETS ========== */

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        System.out.println("Booked Tickets:");
        TicketNode temp = head;

        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    /* ========== SEARCH TICKET ========== */

    public void searchByCustomerName(String name) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        boolean found = false;
        TicketNode temp = head;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No ticket found for customer: " + name);
    }

    public void searchByMovieName(String movie) {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        boolean found = false;
        TicketNode temp = head;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for movie: " + movie);
    }

    /* ========== COUNT TICKETS ========== */

    public int countTickets() {
        if (head == null)
            return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    /* ========== HELPER ========== */

    private void displayTicket(TicketNode t) {
        System.out.println(
            "Ticket ID: " + t.ticketId +
            ", Customer: " + t.customerName +
            ", Movie: " + t.movieName +
            ", Seat: " + t.seatNumber +
            ", Time: " + t.bookingTime
        );
    }
}

