package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.ListManager;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager manager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
    }

    // Test Add Element
    @Test
    void testAddElement() {
        manager.addElement(list, 10);
        manager.addElement(list, 20);

        assertEquals(2, manager.getSize(list));
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    // Test Remove Element
    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);
        list.add(30);

        boolean removed = manager.removeElement(list, 20);

        assertTrue(removed);
        assertEquals(2, manager.getSize(list));
        assertFalse(list.contains(20));
    }

    // Test Remove Element (Element Not Present)
    @Test
    void testRemoveElement_NotPresent() {
        list.add(10);
        list.add(20);

        boolean removed = manager.removeElement(list, 99);

        assertFalse(removed);
        assertEquals(2, manager.getSize(list));
    }

    // Test Size Updates
    @Test
    void testGetSize() {
        assertEquals(0, manager.getSize(list));

        manager.addElement(list, 5);
        assertEquals(1, manager.getSize(list));

        manager.addElement(list, 15);
        assertEquals(2, manager.getSize(list));
    }
}
