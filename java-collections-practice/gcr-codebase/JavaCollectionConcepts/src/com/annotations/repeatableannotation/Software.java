package com.annotations.repeatableannotation;

public class Software {

    @BugReport(description = "NullPointerException occurs on login")
    @BugReport(description = "UI alignment issue on dashboard")
    public void runApp() {
        System.out.println("Software is running...");
    }
}
