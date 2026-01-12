package com.ambulanceroute;

class AmbulanceRoute {

    private HospitalUnit head;
    private HospitalUnit tail;

    // Add unit to circular list
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = tail = newUnit;
            tail.next = head;
        } else {
            tail.next = newUnit;
            tail = newUnit;
            tail.next = head;
        }
        System.out.println("Unit added: " + name);
    }

    // Find nearest available unit
    public void findNearestAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirect patient to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No available unit found. Patient keeps circulating.");
    }

    // Remove unit under maintenance
    public void removeUnit(String name) {
        if (head == null) {
            System.out.println("No units to remove.");
            return;
        }

        HospitalUnit curr = head;
        HospitalUnit prev = tail;

        do {
            if (curr.name.equalsIgnoreCase(name)) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head)
                        head = curr.next;
                    if (curr == tail)
                        tail = prev;
                }

                System.out.println("Unit removed (maintenance): " + name);
                return;
            }
            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Unit not found.");
    }

    // Display circular path
    public void displayRoute() {
        if (head == null) {
            System.out.println("No hospital units.");
            return;
        }

        HospitalUnit temp = head;
        System.out.print("Hospital Route: ");
        do {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.name + ")");
    }
}
