package com.annotations.cacheresult;

public class Main {
    public static void main(String[] args) {

        ExpensiveService service = new ExpensiveService();

        long start1 = System.currentTimeMillis();
        System.out.println("Result: " + CacheManager.execute(service, "slowSquare", 5));
        long end1 = System.currentTimeMillis();
        System.out.println("Time Taken: " + (end1 - start1) + " ms");

        System.out.println("----------------------------------");

        long start2 = System.currentTimeMillis();
        System.out.println("Result: " + CacheManager.execute(service, "slowSquare", 5));
        long end2 = System.currentTimeMillis();
        System.out.println("Time Taken: " + (end2 - start2) + " ms");
    }
}

