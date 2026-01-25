package com.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    // 1) HashSet: quick lookup
    private Set<Policy> hashSetPolicies = new HashSet<>();

    // 2) LinkedHashSet: preserves insertion order
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();

    // 3) TreeSet: sorted by expiry date
    private Set<Policy> treeSetPolicies = new TreeSet<>(
            Comparator.comparing(Policy::getExpiryDate)
                    .thenComparing(Policy::getPolicyNumber)
    );

    // track duplicates by policy number
    private Set<String> seenPolicyNumbers = new HashSet<>();
    private Set<String> duplicatePolicyNumbers = new HashSet<>();

    //STORE POLICIES
    public void addPolicy(Policy policy) {

        // detect duplicates based on policy number
        if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
            duplicatePolicyNumbers.add(policy.getPolicyNumber());
        }

        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // DISPLAY METHODS

    public void displayAllUniquePolicies() {
        System.out.println("\n--- All Unique Policies (HashSet) ---");
        for (Policy p : hashSetPolicies) {
            System.out.println(p);
        }
    }

    public void displayPoliciesInsertionOrder() {
        System.out.println("\n--- Policies in Insertion Order (LinkedHashSet) ---");
        for (Policy p : linkedHashSetPolicies) {
            System.out.println(p);
        }
    }

    public void displayPoliciesSortedByExpiry() {
        System.out.println("\n--- Policies Sorted By Expiry Date (TreeSet) ---");
        for (Policy p : treeSetPolicies) {
            System.out.println(p);
        }
    }

    // RETRIEVAL CRITERIA

    // Policies expiring within next N days
    public void displayExpiringSoon(int days) {
        System.out.println("\n--- Policies Expiring in next " + days + " days ---");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(days);

        for (Policy p : hashSetPolicies) {
            if (!p.getExpiryDate().isBefore(today) && !p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // Policies with specific coverage type
    public void displayByCoverageType(String coverageType) {
        System.out.println("\n--- Policies with Coverage Type: " + coverageType + " ---");

        for (Policy p : hashSetPolicies) {
            if (p.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(p);
            }
        }
    }

    // Duplicate policies (same policy number)
    public void displayDuplicatePolicies() {
        System.out.println("\n--- Duplicate Policy Numbers ---");
        if (duplicatePolicyNumbers.isEmpty()) {
            System.out.println("No duplicates found.");
            return;
        }

        for (String policyNo : duplicatePolicyNumbers) {
            System.out.println("Duplicate: " + policyNo);
        }
    }

    // PERFORMANCE TEST

    public void performanceTest(int n) {
        System.out.println("\n=== Performance Test for " + n + " policies ===");

        List<Policy> testPolicies = new ArrayList<>();
        LocalDate base = LocalDate.now();

        for (int i = 1; i <= n; i++) {
            testPolicies.add(new Policy(
                    "P" + i,
                    "Holder" + i,
                    base.plusDays(i % 365),
                    (i % 2 == 0) ? "Health" : "Auto",
                    1000 + (i * 5)
            ));
        }

        testSetPerformance("HashSet", new HashSet<>(), testPolicies);
        testSetPerformance("LinkedHashSet", new LinkedHashSet<>(), testPolicies);
        testSetPerformance("TreeSet",
                new TreeSet<>(Comparator.comparing(Policy::getExpiryDate)
                        .thenComparing(Policy::getPolicyNumber)),
                testPolicies
        );
    }

    private void testSetPerformance(String name, Set<Policy> set, List<Policy> policies) {

        long startAdd = System.nanoTime();
        for (Policy p : policies) set.add(p);
        long endAdd = System.nanoTime();

        Policy searchTarget = policies.get(policies.size() / 2);

        long startSearch = System.nanoTime();
        boolean found = set.contains(searchTarget);
        long endSearch = System.nanoTime();

        long startRemove = System.nanoTime();
        set.remove(searchTarget);
        long endRemove = System.nanoTime();

        System.out.println("\n--- " + name + " ---");
        System.out.println("Add time: " + (endAdd - startAdd) + " ns");
        System.out.println("Search time: " + (endSearch - startSearch) + " ns (found=" + found + ")");
        System.out.println("Remove time: " + (endRemove - startRemove) + " ns");
    }
}

