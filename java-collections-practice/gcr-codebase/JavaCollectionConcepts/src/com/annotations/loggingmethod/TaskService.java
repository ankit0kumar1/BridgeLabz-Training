package com.annotations.loggingmethod;

public class TaskService {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 1; i <= 100000; i++) {
            int x = i * 2;
        }
        System.out.println("Fast task completed");
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 1; i <= 5000000; i++) {
            int x = i * 2;
        }
        System.out.println("Slow task completed");
    }

    public void normalTask() {
        System.out.println("Normal task (no timing)");
    }
}

