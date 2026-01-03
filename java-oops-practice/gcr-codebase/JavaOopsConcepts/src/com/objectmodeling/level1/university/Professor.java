package com.objectmodeling.level1.university;

import java.util.*;

public class Professor {
    private int professorId;
    private String name;
    private List<Course> coursesTeaching;

    public Professor(int professorId, String name) {
        this.professorId = professorId;
        this.name = name;
        this.coursesTeaching = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
            course.assignProfessor(this);
            System.out.println(name + " assigned to teach " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

