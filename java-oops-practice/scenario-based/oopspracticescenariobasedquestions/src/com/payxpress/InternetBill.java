package com.payxpress;

class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double lateAmount = calculateLateFee(75);
            System.out.println("Internet Bill Reminder!");
            System.out.println("Due Date: " + getDueDate());
            System.out.println("Pay ₹" + lateAmount + " to avoid speed downgrade.");
        }
    }
}

