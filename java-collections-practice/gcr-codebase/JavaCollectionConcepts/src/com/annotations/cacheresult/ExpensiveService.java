package com.annotations.cacheresult;

public class ExpensiveService {

    @CacheResult
    public int slowSquare(int n) {

        // simulate expensive computation
        try {
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return n * n;
    }
}

