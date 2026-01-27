package com.reflection.intermediate;

import java.lang.annotation.*;

//Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
 String name();
}

//Class using annotation
@Author(name = "Ankit Kumar")
class DemoClass {
}

//Main class
public class AnnotationReflection {
 public static void main(String[] args) {

     Class<DemoClass> cls = DemoClass.class;

     if (cls.isAnnotationPresent(Author.class)) {
         Author author = cls.getAnnotation(Author.class);
         System.out.println("Author Name: " + author.name());
     } else {
         System.out.println("Author annotation not found!");
     }
 }
}

