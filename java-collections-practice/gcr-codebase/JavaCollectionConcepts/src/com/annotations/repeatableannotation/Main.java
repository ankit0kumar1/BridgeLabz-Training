package com.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Method method = Software.class.getMethod("runApp");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        System.out.println("Bug Reports:");
        for (BugReport report : reports) {
            System.out.println("- " + report.description());
        }
    }
}

