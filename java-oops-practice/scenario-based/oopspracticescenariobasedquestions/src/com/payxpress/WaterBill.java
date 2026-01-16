package com.payxpress;

class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double lateAmount = calculateLateFee(50);
            System.out.println("Water Bill Reminder!");
            System.out.println("Due Date: " + getDueDate());
            System.out.println("Pay ₹" + lateAmount + " to avoid supply interruption.");
        }
    }
}

