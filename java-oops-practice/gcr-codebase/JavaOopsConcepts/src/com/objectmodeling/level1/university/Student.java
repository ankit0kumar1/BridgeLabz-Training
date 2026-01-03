package com.objectmodeling.level1.university;

import java.util.*;

public class Student {
    private int studentId;
    private String name;
    private List<Course> enrolledCourses;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

