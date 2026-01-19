package com.eduresult;

class EduResults {

    public static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] leftArr = new Student[n1];
        Student[] rightArr = new Student[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = students[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = students[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge by score (descending for rank list)
        while (i < n1 && j < n2) {
            if (leftArr[i].score >= rightArr[j].score) {
                students[k++] = leftArr[i++];
            } else {
                students[k++] = rightArr[j++];
            }
        }

        while (i < n1)
            students[k++] = leftArr[i++];

        while (j < n2)
            students[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Student[] stateResults = {
            new Student(101, "Aditi", 92),
            new Student(102, "Rohan", 88),
            new Student(201, "Meera", 92),
            new Student(202, "Kabir", 85),
            new Student(301, "Sana", 90)
        };

        mergeSort(stateResults, 0, stateResults.length - 1);

        System.out.println("Final State-wise Rank List:");
        for (Student s : stateResults) {
            System.out.println(s);
        }
    }
}

