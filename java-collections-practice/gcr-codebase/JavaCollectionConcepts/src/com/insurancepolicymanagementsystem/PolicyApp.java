package com.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class PolicyApp {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy("P101", "Ankit", LocalDate.now().plusDays(10), "Health", 4500));
        manager.addPolicy(new Policy("P102", "Ravi", LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new Policy("P103", "Aryan", LocalDate.now().plusDays(20), "Home", 8000));
        manager.addPolicy(new Policy("P104", "Prince", LocalDate.now().plusDays(5), "Health", 6000));

        // duplicate policy number
        manager.addPolicy(new Policy("P102", "Ravi Duplicate", LocalDate.now().plusDays(70), "Auto", 9999));

        manager.displayAllUniquePolicies();
        manager.displayPoliciesInsertionOrder();
        manager.displayPoliciesSortedByExpiry();

        manager.displayExpiringSoon(30);
        manager.displayByCoverageType("Health");
        manager.displayDuplicatePolicies();

        // Performance comparison
        manager.performanceTest(50000);
    }
}

