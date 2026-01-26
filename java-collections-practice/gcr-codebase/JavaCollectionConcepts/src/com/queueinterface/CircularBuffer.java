package com.queueinterface;

import java.util.*;

class CircularBuffer {
    private int[] arr;
    private int size;
    private int front;
    private int rear;
    private int count;

    public CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    // insert element (overwrite if full)
    public void add(int value) {
        arr[rear] = value;
        rear = (rear + 1) % size;

        if (count == size) {
            // buffer full -> overwrite oldest -> move front
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    // remove oldest element
    public int remove() {
        if (count == 0) {
            System.out.println("Buffer empty");
            return -1;
        }

        int val = arr[front];
        front = (front + 1) % size;
        count--;
        return val;
    }

    // get buffer contents in correct order
    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(arr[(front + i) % size]);
        }
        return result;
    }

    @Override
    public String toString() {
        return getBuffer().toString();
    }
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.println(buffer); // [1, 2, 3]

        buffer.add(4);
        System.out.println(buffer); // [2, 3, 4]

        buffer.add(5);
        System.out.println(buffer); // [3, 4, 5]
    }
}

   

