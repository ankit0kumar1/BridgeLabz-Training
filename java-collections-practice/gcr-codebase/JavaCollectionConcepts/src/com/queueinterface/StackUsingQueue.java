package com.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int x) {
		q1.add(x);
	}
	public int pop() {
		if(q1.isEmpty()) System.out.println("Stack is empty");
		
		//move all except last 
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		
		int popped = q1.poll(); // last element
		// swap q1 and q2
		Queue<Integer> temp =q1;
		q1 = q2;
		q2 =temp;
		
		return popped;
	}
	
    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int topElement = q1.remove();
        q2.add(topElement); // put it back

        // swap
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }
    
    @Override
    public String toString() {
        return q1.toString();  // prints current stack elements
    }
    
    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.pop()); // 3
        System.out.println(st.top()); // 2
    }
	
}
