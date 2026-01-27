package com.junitpractice;

import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element)); // remove by value, not by index
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}
