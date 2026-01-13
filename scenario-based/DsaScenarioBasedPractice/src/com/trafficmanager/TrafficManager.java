package com.trafficmanager;

import java.util.*;

class TrafficManager {

    // Circular Linked List (Roundabout)
    private Vehicle tail = null;

    // Queue (Waiting vehicles)
    private Queue<String> waitingQueue;
    private int queueCapacity;

    TrafficManager(int queueCapacity) {
        this.queueCapacity = queueCapacity;
        waitingQueue = new ArrayDeque<>();
    }

    // Add vehicle directly into roundabout
    public void addToRoundabout(String number) {
        Vehicle newVehicle = new Vehicle(number);

        if (tail == null) {
            tail = newVehicle;
            tail.next = tail; // circular
        } else {
            newVehicle.next = tail.next;
            tail.next = newVehicle;
            tail = newVehicle;
        }
        System.out.println(number + " entered the roundabout");
    }

    // Remove vehicle from roundabout (exit point)
    public void removeFromRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println(head.number + " exited the roundabout");
            tail = null;
        } else {
            System.out.println(head.number + " exited the roundabout");
            tail.next = head.next;
        }
    }

    // Add vehicle to waiting queue
    public void enqueueVehicle(String number) {
        if (waitingQueue.size() == queueCapacity) {
            System.out.println("Queue Overflow! Cannot add " + number);
            return;
        }
        waitingQueue.offer(number);
        System.out.println(number + " is waiting to enter");
    }

    // Move vehicle from queue to roundabout
    public void allowEntryFromQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return;
        }
        String number = waitingQueue.poll();
        addToRoundabout(number);
    }

    // Print roundabout state
    public void printRoundabout() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle temp = tail.next;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }
}

