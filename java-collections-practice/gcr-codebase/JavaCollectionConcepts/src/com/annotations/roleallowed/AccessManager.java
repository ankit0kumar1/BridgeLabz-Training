package com.annotations.roleallowed;

import java.lang.reflect.Method;

public class AccessManager {

    public static void execute(Object obj, String methodName) {

        try {
            Class<?> clazz = obj.getClass();

            // Check class-level annotation
            if (clazz.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = clazz.getAnnotation(RoleAllowed.class);
                String requiredRole = roleAllowed.value();
                String currentRole = UserContext.getRole();

                if (!currentRole.equals(requiredRole)) {
                    System.out.println("Access Denied!");
                    return;
                }
            }

            // if allowed, execute method
            Method method = clazz.getMethod(methodName);
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

