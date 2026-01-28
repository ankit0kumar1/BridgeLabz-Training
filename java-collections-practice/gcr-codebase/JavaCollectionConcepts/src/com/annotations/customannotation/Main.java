package com.annotations.customannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        // Get method info using Reflection
        Method method = manager.getClass().getMethod("completeProject");

        // Check if annotation exists
        if (method.isAnnotationPresent(TaskInfo.class)) {

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }

        // call method normally
        manager.completeProject();
    }
}

