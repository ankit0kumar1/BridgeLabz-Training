package com.annotations.maxlengthannotation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validateMaxLength("username", username); // validate before assignment
        this.username = username;
    }

    private void validateMaxLength(String fieldName, String value) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);

            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int limit = maxLength.value();

                if (value != null && value.length() > limit) {
                    throw new IllegalArgumentException(
                        fieldName + " length must be <= " + limit + " characters"
                    );
                }
            }

        } catch (NoSuchFieldException e) {
            throw new RuntimeException("Field not found: " + fieldName);
        }
    }

    public String getUsername() {
        return username;
    }
}

