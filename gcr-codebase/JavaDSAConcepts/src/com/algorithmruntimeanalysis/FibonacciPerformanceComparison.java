package com.algorithmruntimeanalysis;

import java.util.Scanner;

public class FibonacciPerformanceComparison {
	//recursive fibonacci method time Complexity: O(2^N)
	public static int fibonacciRecursive(int number) {
		//base condition
		if (number <= 1) {
			return number;
		}
		//recursive calls
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	}
	// iterative fibonacci method time Complexity: O(N)
	public static int fibonacciIterative(int number) {

		//base condition
		if (number <= 1) {
			return number;
		}
		int first = 0;
		int second = 1;
		int sum = 0;
		//loop to calculate fibonacci number
		for (int i = 2; i <= number; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}

		return second;
	}

	// main method
	public static void main(String[] args) {

		//create the scanner object
		Scanner input = new Scanner(System.in);
		// taking input from user
		System.out.print("Enter Fibonacci number (N): ");
		int number = input.nextInt();
		// calculating fibonacci using recursion
		long recursiveStartTime = System.nanoTime();
		int recursiveResult = fibonacciRecursive(number);
		long recursiveEndTime = System.nanoTime();
		// calculating Fibonacci using iteration
		long iterativeStartTime = System.nanoTime();
		int iterativeResult = fibonacciIterative(number);
		long iterativeEndTime = System.nanoTime();

		// Displaying results
		System.out.println("\nfibonacci Results");
		System.out.println("recursive Result : " + recursiveResult);
		System.out.println("recursive Time   : " + (recursiveEndTime - recursiveStartTime) + " ns");

		System.out.println("iterative Result : " + iterativeResult);
		System.out.println("iterative Time   : " + (iterativeEndTime - iterativeStartTime) + " ns");

		input.close();
	}
}