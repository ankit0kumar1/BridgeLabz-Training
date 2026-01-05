package com.linkedlist;

public class TaskSchedulerApp {
    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(1, "Database Backup", 1, "2026-01-10");
        scheduler.addAtEnd(2, "Bug Fixing", 2, "2026-01-08");
        scheduler.addAtBeginning(3, "Code Review", 1, "2026-01-07");
        scheduler.addAtPosition(2, 4, "Deploy Build", 3, "2026-01-09");

        scheduler.displayAllTasks();

        System.out.println();
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println();
        scheduler.searchByPriority(1);

        System.out.println();
        scheduler.removeByTaskId(2);

        System.out.println("\nAfter Deletion:");
        scheduler.displayAllTasks();
    }
}

