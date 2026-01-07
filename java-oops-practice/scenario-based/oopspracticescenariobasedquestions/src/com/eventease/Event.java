package com.eventease;

import java.time.LocalDate;

public abstract class Event implements ISchedulable {

    private static int counter = 1000;

    private final int eventId;
    private String eventName;
    private String location;
    private LocalDate date;
    private int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;
    private double totalCost;

    private User organizer;

    // Constructor without services
    public Event(String eventName, String location,
                 LocalDate date, int attendees, User organizer) {

        this.eventId = counter++;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;

        this.venueCost = 5000;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(String eventName, String location,
                 LocalDate date, int attendees,
                 User organizer, boolean catering, boolean decoration) {

        this(eventName, location, date, attendees, organizer);

        if (catering) {
            serviceCost += 2000;
        }
        if (decoration) {
            serviceCost += 1500;
        }
    }

    protected void applyDiscount(double amount) {
        this.discount = amount;
    }

    public double calculateTotalCost() {
        totalCost = venueCost + serviceCost - discount;
        return totalCost;
    }

    public int getEventId() {
        return eventId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAttendees() {
        return attendees;
    }

    @Override
    public void reschedule(LocalDate newDate) {
        this.date = newDate;
        System.out.println("Event rescheduled to: " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Event with ID " + eventId + " has been cancelled.");
    }

    @Override
    public abstract void schedule();
}
