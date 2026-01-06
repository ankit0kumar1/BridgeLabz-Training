package com.campusconnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        // Faculty object
        Faculty faculty = new Faculty("Sushant","sushant@university.edu",101,"Computer Science");
        Student student = new Student(21,"Ankit","ankit@university.edu");
        // Adding grades
        student.addGrade(8.5);
        student.addGrade(9.0);
        student.addGrade(7.8);

        // course object
        Course course = new Course(501,"Data Structures",faculty);

        student.enrollCourse(course);
        student.dropCourse(course);

        Person p;
        p = student;
        p.printDetails();  
        System.out.println();
        p = faculty;
        p.printDetails();   
    }
}
