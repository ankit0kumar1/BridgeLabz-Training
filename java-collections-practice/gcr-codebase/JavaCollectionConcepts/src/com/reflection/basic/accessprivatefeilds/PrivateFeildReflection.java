package com.reflection.basic.accessprivatefeilds;

import java.lang.reflect.Field;
public class PrivateFeildReflection {
	public static void main(String[] args) {
        try {
            Person p = new Person();
            p.showAge();

            // Step 1: Get Class object
            Class<?> cls = p.getClass();

            // Step 2: Get private field "age"
            Field field = cls.getDeclaredField("age");

            // Step 3: Allow access to private field
            field.setAccessible(true);
         // Step 4: Modify private field value
            field.set(p, 25);

            // Step 5: Retrieve private field value
            int value = (int) field.get(p);

            System.out.println("Age (after reflection update): " + value);

            p.showAge();

        } catch (NoSuchFieldException e) {
            System.out.println("Field not found!");
        } catch (IllegalAccessException e) {
            System.out.println("Access not allowed!");
        }
    }
}

