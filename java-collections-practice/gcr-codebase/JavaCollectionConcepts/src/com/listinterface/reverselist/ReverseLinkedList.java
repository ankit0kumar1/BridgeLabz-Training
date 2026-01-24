package com.listinterface.reverselist;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        ListIterator<Integer> left = list.listIterator();
        ListIterator<Integer> right = list.listIterator(list.size());

        for (int k = 0; k < list.size() / 2; k++) {
            int a = left.next();
            int b = right.previous();

            left.set(b);
            right.set(a);
        }

        System.out.println(list);
    }
}

