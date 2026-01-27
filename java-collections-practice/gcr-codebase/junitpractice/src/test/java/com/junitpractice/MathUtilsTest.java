package com.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testDivideByZeroThrowsException() {
        MathUtils utils = new MathUtils();

        assertThrows(ArithmeticException.class, () -> utils.divide(10, 0));
    }
    @Test
    void testDivideByZeroExceptionMessage() {
        MathUtils utils = new MathUtils();

        ArithmeticException ex = assertThrows(ArithmeticException.class,
                () -> utils.divide(10, 0));

        assertEquals("Cannot divide by zero", ex.getMessage());
    }

}
