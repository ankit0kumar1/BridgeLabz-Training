package com.votingsystem;

import java.util.*;

public class VotingSystem {

    
    private Map<String, Integer> voteCount = new HashMap<>();

    // 2) LinkedHashMap to maintain order of voting activity
  
    private Map<String, List<String>> voteOrder = new LinkedHashMap<>();

    // Cast a vote
    public void vote(String candidate) {

        // HashMap: update count
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);

        // LinkedHashMap maintain order of votes
        voteOrder.computeIfAbsent(candidate, c -> new ArrayList<>()).add("VOTE");
    }

    // Display results sorted by candidate name using TreeMap
    public void displaySortedResults() {
        System.out.println("\n--- Results (Sorted by Candidate Name) ---");

        Map<String, Integer> sorted = new TreeMap<>(voteCount);

        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display vote insertion order using LinkedHashMap
    public void displayVoteOrder() {
        System.out.println("\n--- Vote Order (LinkedHashMap keeps insertion order) ---");

        for (Map.Entry<String, List<String>> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " received " + entry.getValue().size() + " votes in order");
        }
    }

    // Show live vote count 
    public void displayVoteCounts() {
        System.out.println("\n--- Vote Count (HashMap) ---");
        System.out.println(voteCount);
    }

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");
        system.vote("Carol");
        system.vote("Bob");
        system.vote("Alice");

        system.displayVoteCounts();
        system.displayVoteOrder();
        system.displaySortedResults();
    }
}

