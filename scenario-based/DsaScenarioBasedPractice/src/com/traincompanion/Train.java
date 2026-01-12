package com.traincompanion;

class Train {

    private Compartment head;
    private Compartment tail;
    private Compartment current;

    // Add compartment at end
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = tail = current = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
        System.out.println("Compartment added: " + name);
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                if (current == temp)
                    current = temp.next != null ? temp.next : temp.prev;

                System.out.println("Compartment removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }

    // Move forward
    public void moveForward() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrent();
        } else {
            System.out.println("You are at the last compartment.");
        }
    }

    // Move backward
    public void moveBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrent();
        } else {
            System.out.println("You are at the first compartment.");
        }
    }

    // Display current + adjacent compartments
    public void showCurrent() {
        System.out.println("\nCurrent Compartment: " + current.name);

        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));

        System.out.println("Next: " +
                (current.next != null ? current.next.name : "None"));
    }

    // Search for service
    public void searchCompartment(String keyword) {
        Compartment temp = head;
        while (temp != null) {
            if (temp.name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Service found in: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Service not found.");
    }
}

