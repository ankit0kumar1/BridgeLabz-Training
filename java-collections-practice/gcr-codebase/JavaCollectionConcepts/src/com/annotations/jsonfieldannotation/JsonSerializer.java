package com.annotations.jsonfieldannotation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                try {
                    Object value = field.get(obj);

                    if (!first) {
                        json.append(", ");
                    }

                    json.append("\"").append(jf.name()).append("\": ");
                    json.append(formatValue(value));

                    first = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }

    private static String formatValue(Object value) {
        if (value == null) return "null";

        // String value => wrap with quotes
        if (value instanceof String) {
            return "\"" + value + "\"";
        }

        // int, boolean, double etc => no quotes
        return value.toString();
    }
}

