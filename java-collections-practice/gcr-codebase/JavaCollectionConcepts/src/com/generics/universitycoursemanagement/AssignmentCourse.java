package com.generics.universitycoursemanagement;

class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String title, int totalAssignments) {
        super(title);
        this.totalAssignments = totalAssignments;
    }

    public void displayType() {
        System.out.println("Assignment Course: " + getTitle() + " | Assignments: " + totalAssignments);
    }
}
