package com.stackandqueue;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	static Stack<Integer> stack1 = new Stack<>(); // this stack for performing enqueue operation
	static Stack<Integer> stack2 = new Stack<>(); // this stack for performing dequeue operation

	public static void enqueue(int element) {
		stack1.push(element);
		System.out.println(element + " enqueued in queue");
	}

	public static int dequeue() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		int popElement = stack2.pop();
		return popElement;
	}

	public static void display() {
		System.out.print("Queue elements: ");

		// Display elements from stack2 (top to bottom)
		for (int i = stack2.size() - 1; i >= 0; i--) {
			System.out.print(stack2.get(i) + " ");
		}

		// Display elements from stack1 (bottom to top)
		for (int i = 0; i < stack1.size(); i++) {
			System.out.print(stack1.get(i) + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);

		display();

		System.out.println("dequeued: " + dequeue());

		display();

		System.out.println("dequeued: " + dequeue());
		
		display();

	}
}
