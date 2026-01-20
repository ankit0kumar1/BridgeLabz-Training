package com.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class University {

    public static void main(String[] args) {

        Course<ExamBasedCourse> math =
                new Course<>("Mathematics", new ExamBasedCourse());

        Course<AssignmentBasedCourse> cs =
                new Course<>("Computer Science", new AssignmentBasedCourse());

        Course<ResearchBasedCourse> phd =
                new Course<>("PhD Research", new ResearchBasedCourse());

        System.out.println("Evaluating individual courses:");
        math.evaluateCourse();
        cs.evaluateCourse();
        phd.evaluateCourse();

        System.out.println("\nDisplaying all course types dynamically:");
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamBasedCourse());
        courseTypes.add(new AssignmentBasedCourse());
        courseTypes.add(new ResearchBasedCourse());

        ViewCourse.displayCourses(courseTypes);
    }
}

