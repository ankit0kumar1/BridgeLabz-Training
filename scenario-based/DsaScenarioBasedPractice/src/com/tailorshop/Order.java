package com.tailorshop;

class Order {
    String orderId;
    String customerName;
    int deadline; // delivery date as number (e.g., 20260210 or days count)

    Order(String orderId, String customerName, int deadline) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return orderId + " - " + customerName + " (Deadline: " + deadline + ")";
    }
}

