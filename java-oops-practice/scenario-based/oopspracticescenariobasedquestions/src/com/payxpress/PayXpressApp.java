package com.payxpress;

public class PayXpressApp {

    public static void main(String[] args) {

        IPayable electricity = new ElectricityBill(1200, "15-Jan-2026");
        IPayable water = new WaterBill(500, "18-Jan-2026");
        IPayable internet = new InternetBill(999, "20-Jan-2026");

        System.out.println("=== Sending Reminders ===");
        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();

        System.out.println("\n=== Paying Bills ===");
        electricity.pay();
        internet.pay();

        System.out.println("\n=== Sending Reminders Again ===");
        electricity.sendReminder();
        water.sendReminder();
        internet.sendReminder();
    }
}

