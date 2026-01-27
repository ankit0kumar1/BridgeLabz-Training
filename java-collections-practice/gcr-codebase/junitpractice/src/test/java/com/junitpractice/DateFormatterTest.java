package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.DateFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private DateFormatter formatter;

    @BeforeEach
    void setup() {
        formatter = new DateFormatter();
    }

    // ✅ Valid date tests
    @Test
    void testFormatDateValid() {
        assertEquals("27-01-2026", formatter.formatDate("2026-01-27"));
        assertEquals("01-12-2025", formatter.formatDate("2025-12-01"));
    }

    // ❌ Invalid date format
    @Test
    void testFormatDateInvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("27-01-2026"));
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2026/01/27"));
    }

    // ❌ Invalid date values
    @Test
    void testFormatDateInvalidValue() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2026-13-01")); // month invalid
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2026-02-30")); // day invalid
    }

    // ❌ Null input
    @Test
    void testFormatDateNull() {
        assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null));
    }
}
