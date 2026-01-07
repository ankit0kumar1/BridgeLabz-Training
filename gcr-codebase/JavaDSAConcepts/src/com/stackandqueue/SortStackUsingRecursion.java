package com.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class SortStackUsingRecursion {

	static Stack<Integer> stack = new Stack<>();

	// method to sort the stack
	public static void sort(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}

		int top = stack.pop();
		sort(stack);

		insertInSortedOrder(stack, top);
	}

	// helper method
	private static void insertInSortedOrder(Stack<Integer> stack, int element) {

		// base condition
		if (stack.isEmpty() || stack.peek() <= element) {
			stack.push(element);
			return;
		}

		int top = stack.pop();
		insertInSortedOrder(stack, element);
		stack.push(top);
	}

	// method to display the stack
	public static void display() {
		System.out.println("\nStack " + stack);
	}

	public static void main(String[] args) {

		// creating Scanner object
		Scanner input = new Scanner(System.in);

		int choice;
		do {
			System.out.println("\n1. Push");
			System.out.println("2. Sort Stack");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice = input.nextInt();

			switch (choice) {
			case 1 -> {
				System.out.print("Enter element: ");
				stack.push(input.nextInt());
			}
			case 2 -> {
				sort(stack);
				System.out.println("Stack sorted");
			}
			case 3 -> display();
			case 4 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice");
			}

		} while (choice != 4);

		input.close(); // closing input stream
	}
}