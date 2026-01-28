package com.annotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // cache storage
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) {

        try {
            Class<?> clazz = obj.getClass();

            // Find method by name + parameters count
            Method targetMethod = null;
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getName().equals(methodName) && method.getParameterCount() == args.length) {
                    targetMethod = method;
                    break;
                }
            }

            if (targetMethod == null) {
                throw new RuntimeException("Method not found: " + methodName);
            }

            // If annotation exists -> enable caching
            if (targetMethod.isAnnotationPresent(CacheResult.class)) {

                String key = buildKey(clazz.getName(), methodName, args);

                // If present in cache -> return cached value
                if (cache.containsKey(key)) {
                    System.out.println(" Returning Cached Result for " + methodName);
                    return cache.get(key);
                }

                // else compute and store
                System.out.println(" Computing Result (Not Cached)...");
                Object result = targetMethod.invoke(obj, args);

                cache.put(key, result);
                return result;
            }

            // If not annotated, call normally
            return targetMethod.invoke(obj, args);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String buildKey(String className, String methodName, Object[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(className).append(".").append(methodName).append("(");

        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if (i < args.length - 1) sb.append(",");
        }

        sb.append(")");
        return sb.toString();
    }
}

