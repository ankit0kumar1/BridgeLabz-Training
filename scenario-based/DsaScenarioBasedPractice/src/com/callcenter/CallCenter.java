package com.callcenter;

import java.util.*;

class CallCenter {

    // Normal customers – FIFO
    private Queue<Customer> normalQueue;

    // VIP customers – served first
    private PriorityQueue<Customer> vipQueue;

    // Track call count per customer per month
    private HashMap<String, Integer> callFrequencyMap;

    public CallCenter() {
        normalQueue = new LinkedList<>();

        vipQueue = new PriorityQueue<>(
            (c1, c2) -> c1.customerId.compareTo(c2.customerId)
        );

        callFrequencyMap = new HashMap<>();
    }

    // Incoming call
    public void receiveCall(Customer customer) {
        // Update call count
        callFrequencyMap.put(
            customer.customerId,
            callFrequencyMap.getOrDefault(customer.customerId, 0) + 1
        );

        // Route customer to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP Call Received from: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal Call Received from: " + customer.name);
        }
    }

    // Serve next call
    public void serveNextCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Serving VIP customer: " + customer.name);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Serving normal customer: " + customer.name);
        } else {
            System.out.println("No calls in queue");
        }
    }

    // Get call count for a customer
    public void getCustomerCallCount(String customerId) {
        int count = callFrequencyMap.getOrDefault(customerId, 0);
        System.out.println("Customer " + customerId + " has called " + count + " times this month");
    }
}
