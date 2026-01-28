package com.annotations.todoannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Method[] methods = ProjectService.class.getDeclaredMethods();

        System.out.println("Pending Tasks (TODO):");
        System.out.println("-----------------------------");

        for (Method method : methods) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method     : " + method.getName());
                System.out.println("Task       : " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority   : " + todo.priority());
                System.out.println("-----------------------------");
            }
        }
    }
}
