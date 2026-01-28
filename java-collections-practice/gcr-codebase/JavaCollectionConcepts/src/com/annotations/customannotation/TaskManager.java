package com.annotations.customannotation;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ankit")
    public void completeProject() {
        System.out.println("Project task completed!");
    }
}

