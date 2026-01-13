package com.trafficmanager;

public class TrafficManagerApp {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager(3);

        tm.enqueueVehicle("CAR-101");
        tm.enqueueVehicle("CAR-102");
        tm.enqueueVehicle("CAR-103");
        tm.enqueueVehicle("CAR-104"); // Overflow

        tm.allowEntryFromQueue();
        tm.allowEntryFromQueue();

        tm.printRoundabout();

        tm.removeFromRoundabout();
        tm.printRoundabout();

        tm.allowEntryFromQueue();
        tm.allowEntryFromQueue(); // Underflow
    }
}

