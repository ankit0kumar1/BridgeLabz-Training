package com.payxpress;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double lateAmount = calculateLateFee(100);
            System.out.println("Electricity Bill Reminder!");
            System.out.println("Due Date: " + getDueDate());
            System.out.println("Pay ₹" + lateAmount + " to avoid disconnection.");
        }
    }
}
