package com.reflection.basic.invokeprivatemethod;

import java.lang.reflect.Method;

public class PrivateMethodInvoke {
    public static void main(String[] args) {
        try {
            Calculator cal = new Calculator();

            // Step 1: get Class object
            Class<?> cls = cal.getClass();

            // Step 2: get private method multiply(int,int)
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Step 3: bypass private access
            method.setAccessible(true);

            // Step 4: invoke method
            Object result = method.invoke(cal, 6, 7);

            System.out.println("Result = " + result);

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
