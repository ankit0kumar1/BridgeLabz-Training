package com.sorting;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements into output array (stable)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = age - minAge;
            output[count[index] - 1] = age;
            count[index]--;
        }

        // Copy sorted ages back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] studentAges = {14, 12, 15, 10, 18, 13, 12, 16};

        System.out.println("Before Sorting:");
        for (int a : studentAges) {
            System.out.print(a + " ");
        }

        countingSort(studentAges);

        System.out.println("\nAfter Sorting (Ascending):");
        for (int a : studentAges) {
            System.out.print(a + " ");
        }
    }
}

