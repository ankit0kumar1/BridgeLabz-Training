package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils utils;

    @BeforeEach
    void setup() {
        utils = new StringUtils();
    }

    // reverse() Tests 
    @Test
    void testReverse_NormalString() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testReverse_EmptyString() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    void testReverse_SingleChar() {
        assertEquals("a", utils.reverse("a"));
    }

    @Test
    void testReverse_WithSpaces() {
        assertEquals("dlrow olleh", utils.reverse("hello world"));
    }

    @Test
    void testReverse_Null() {
        assertNull(utils.reverse(null));
    }

    // isPalindrome() Tests 
    @Test
    void testIsPalindrome_TrueCase() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("level"));
    }

    @Test
    void testIsPalindrome_FalseCase() {
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    void testIsPalindrome_EmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    void testIsPalindrome_Null() {
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testIsPalindrome_CaseSensitive() {
        // because we used equals() directly
        assertFalse(utils.isPalindrome("Madam"));
    }

    // toUpperCase() Tests 
    @Test
    void testToUpperCase_NormalString() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCase_AlreadyUpper() {
        assertEquals("JAVA", utils.toUpperCase("JAVA"));
    }

    @Test
    void testToUpperCase_MixedCase() {
        assertEquals("JAVAU", utils.toUpperCase("jaVaU"));
    }

    @Test
    void testToUpperCase_EmptyString() {
        assertEquals("", utils.toUpperCase(""));
    }

    @Test
    void testToUpperCase_Null() {
        assertNull(utils.toUpperCase(null));
    }
}
