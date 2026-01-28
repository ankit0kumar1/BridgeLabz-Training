package com.annotations.todoannotation;

public class ProjectService {

    @Todo(task = "Add user login functionality", assignedTo = "Ankit", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Login feature under development...");
    }

    @Todo(task = "Implement payment gateway", assignedTo = "Rahul")
    public void paymentFeature() {
        System.out.println("Payment feature under development...");
    }

    @Todo(task = "Improve UI responsiveness", assignedTo = "Priya", priority = "LOW")
    public void uiImproveFeature() {
        System.out.println("UI improvements pending...");
    }

    public void completedFeature() {
        System.out.println("This feature is already completed.");
    }
}

