package com.junitpractice;

public class TaskRunner {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // 3 seconds
        return "Done";
    }
}
