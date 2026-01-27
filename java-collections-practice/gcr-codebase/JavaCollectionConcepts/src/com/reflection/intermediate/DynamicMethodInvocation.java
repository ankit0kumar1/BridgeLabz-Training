package com.reflection.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();

        System.out.print("Enter operation (add / subtract / multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            // get method dynamically based on name + parameters
            Method method = cls.getMethod(methodName, int.class, int.class);

            // invoke method dynamically
            Object result = method.invoke(obj, a, b);

            System.out.println("Result = " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("❌ Invalid operation! Method not found: " + methodName);
        } catch (Exception e) {
            System.out.println("❌ Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
