package com.junitpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junitpractice.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(10, calc.add(7, 3));
        assertEquals(-2, calc.add(-5, 3));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(4, calc.subtract(7, 3));
        assertEquals(-8, calc.subtract(-5, 3));
        assertEquals(5, calc.subtract(5, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(21, calc.multiply(7, 3));
        assertEquals(-15, calc.multiply(-5, 3));
        assertEquals(0, calc.multiply(100, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertEquals(-2, calc.divide(-6, 3));
    }

    //  Bonus: Division by zero test
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
