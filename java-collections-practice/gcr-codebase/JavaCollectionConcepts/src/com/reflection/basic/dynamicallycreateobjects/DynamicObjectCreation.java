package com.reflection.basic.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Step 1: Load class dynamically
            Class<?> cls = Class.forName("Student");

            // Step 2: Create object using default constructor
            Constructor<?> cons1 = cls.getDeclaredConstructor();
            Object obj1 = cons1.newInstance();
            
            System.out.println("Student created using default constructor");
            ((Student) obj1).display();
            
            // Step 3: Create object using parameterized constructor
            Constructor<?> cons2 = cls.getDeclaredConstructor(int.class, String.class);
            Object obj2 = cons2.newInstance(101, "Ankit");

            System.out.println("\nStudent created using parameterized constructor ");
            ((Student) obj2).display();

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
