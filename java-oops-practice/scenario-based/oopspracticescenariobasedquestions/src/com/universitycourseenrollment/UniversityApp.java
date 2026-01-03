package com.universitycourseenrollment;

public class UniversityApp {
    public static void main(String[] args) {

        Student s1 = new Undergraduate(101, "Ankit", "AI");
        Student s2 = new Postgraduate(102, "keshav");

        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS201", "Advanced Algorithms");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        Faculty f1 = new Faculty("Dr. Rao");

        f1.assignLetterGrade(e1, 85);
        f1.assignPassFailGrade(e2, 45);

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}

