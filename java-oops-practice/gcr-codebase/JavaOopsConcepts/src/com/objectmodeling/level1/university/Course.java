package com.objectmodeling.level1.university;

import java.util.*;

public class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

