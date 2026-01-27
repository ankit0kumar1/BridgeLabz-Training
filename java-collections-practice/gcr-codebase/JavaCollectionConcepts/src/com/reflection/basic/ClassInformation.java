package com.reflection.basic;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter class name (example: java.util.ArrayList): ");
        String className = sc.nextLine();

        try {
            // Load class dynamically
            Class<?> cls = Class.forName(className);

            System.out.println("\n");
            System.out.println("Class Name: " + cls.getName());
            System.out.println("Package   : " + cls.getPackageName());
            System.out.println("\n");

            // Constructors
            System.out.println("Constructors ");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }

            // Fields
            System.out.println("\nFields");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            // Methods
            System.out.println("\nMethods");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

