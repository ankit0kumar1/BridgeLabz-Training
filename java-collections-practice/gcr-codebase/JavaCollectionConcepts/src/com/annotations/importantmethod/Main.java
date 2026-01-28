package com.annotations.importantmethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        System.out.println("Important Methods Found:");

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Level      : " + imp.level());
                System.out.println("---------------------------");
            }
        }
    }
}

