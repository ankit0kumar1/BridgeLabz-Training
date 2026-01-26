package com.queueinterface.hospitaltriage;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
            (p1, p2) -> (p2.severity- p1.severity) // higher severity first
        );

        // Adding patients
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            Patient p = pq.poll(); // removes highest severity patient
            System.out.println(p.name);
        }
    }
}
