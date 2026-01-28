package com.annotations.loggingmethod;

public class Main {
    public static void main(String[] args) {

        TaskService service = new TaskService();

        ExecutionTimer.execute(service, "fastTask");
        System.out.println("------------------");

        ExecutionTimer.execute(service, "slowTask");
        System.out.println("------------------");

        ExecutionTimer.execute(service, "normalTask");
    }
}

