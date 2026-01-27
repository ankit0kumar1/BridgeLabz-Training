package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    void setup() {
        registration = new UserRegistration();
    }

    // ✅ Valid Registration
    @Test
    void testValidUserRegistration() {
        assertTrue(registration.registerUser("ankit", "ankit@gmail.com", "Password1"));
    }

    // ❌ Invalid username tests
    @Test
    void testInvalidUsername_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(null, "test@gmail.com", "Password1"));
    }

    @Test
    void testInvalidUsername_Empty() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("   ", "test@gmail.com", "Password1"));
    }

    @Test
    void testInvalidUsername_TooShort() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ab", "test@gmail.com", "Password1"));
    }

    // ❌ Invalid email tests
    @Test
    void testInvalidEmail_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", null, "Password1"));
    }

    @Test
    void testInvalidEmail_Format() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", "ankitgmail.com", "Password1"));
    }

    // ❌ Invalid password tests
    @Test
    void testInvalidPassword_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", "ankit@gmail.com", null));
    }

    @Test
    void testInvalidPassword_TooShort() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", "ankit@gmail.com", "Pass1"));
    }

    @Test
    void testInvalidPassword_NoUppercase() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", "ankit@gmail.com", "password1"));
    }

    @Test
    void testInvalidPassword_NoDigit() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("ankit", "ankit@gmail.com", "Password"));
    }
}
