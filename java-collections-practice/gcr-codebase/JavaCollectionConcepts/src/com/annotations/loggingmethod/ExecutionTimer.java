package com.annotations.loggingmethod;

import java.lang.reflect.Method;

public class ExecutionTimer {

    public static void execute(Object obj, String methodName) {

        try {
            Method method = obj.getClass().getMethod(methodName);

            // check if annotation exists
            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();

                long timeTaken = end - start;

                System.out.println("Execution Time of " + methodName + "(): " + timeTaken + " ns");
            } else {
                method.invoke(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

