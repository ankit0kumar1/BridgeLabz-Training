package com.geomeasuresolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GeoMeasureApp {

    public static void compareLines(Line l1, Line l2) {
        double length1 = l1.calculateLength();
        double length2 = l2.calculateLength();

        if (length1 == length2) {
            System.out.println("Both lines are of equal length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer.");
        } else {
            System.out.println("Line 2 is longer.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line> lines = new ArrayList<>();

        System.out.print("How many lines do you want to compare? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter coordinates for Line " + (i + 1));
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            lines.add(new Line(x1, y1, x2, y2));
        }

        // Compare lines pairwise
        for (int i = 0; i < lines.size() - 1; i++) {
            System.out.println("\nComparing Line " + (i + 1) + " and Line " + (i + 2));
            compareLines(lines.get(i), lines.get(i + 1));
        }

        sc.close();
    }
}

