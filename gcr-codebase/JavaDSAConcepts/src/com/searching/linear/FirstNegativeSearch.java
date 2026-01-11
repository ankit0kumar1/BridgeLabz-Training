package com.searching.linear;

public class FirstNegativeSearch {

	public static void main(String[] args) { 
		// Input array
		int[] numbers = { 5, 3, 7 , -2, 8, -9 };
		// Call method to find first negative number
		int index = findFirstNegative(numbers);
		// Output
		if (index != -1) {
			System.out.println("First negative number found at index: " + index);
			System.out.println("Value: " + numbers[index]);
		} else {
			System.out.println("No negative number found in the array");
		}
	}

	// Linear search method
	public static int findFirstNegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return i; 
			}
		}
		return -1;
	}
}
