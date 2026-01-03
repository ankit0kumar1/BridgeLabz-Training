package com.objectmodeling.level1.university;

public class University {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Ankit");
        Student s2 = new Student(102, "Riya");

        Professor p1 = new Professor(1, "Dr. Sharma");

        Course c1 = new Course("CS101", "Object Oriented Programming");
        Course c2 = new Course("CS102", "Data Structures");

        // Professor teaches courses
        p1.assignCourse(c1);
        p1.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);
    }
}

