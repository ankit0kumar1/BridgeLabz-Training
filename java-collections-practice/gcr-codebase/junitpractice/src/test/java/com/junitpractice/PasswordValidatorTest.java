package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.PasswordValidator;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    void setup() {
        validator = new PasswordValidator();
    }

    // Valid passwords
    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("HelloWorld9"));
        assertTrue(validator.isValid("A1bcdefg"));
    }

    // Invalid: less than 8 characters
    @Test
    void testInvalidShortPassword() {
        assertFalse(validator.isValid("Abc123"));
    }

    // Invalid: no uppercase letter
    @Test
    void testInvalidNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    // Invalid: no digit
    @Test
    void testInvalidNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    // Invalid: null
    @Test
    void testInvalidNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
