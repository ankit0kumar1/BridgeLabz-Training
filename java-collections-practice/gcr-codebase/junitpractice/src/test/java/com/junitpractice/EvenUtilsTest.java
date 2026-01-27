package com.junitpractice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenUtilsTest {

    private final EvenUtils utils = new EvenUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testIsEven_TrueCases(int number) {
        assertTrue(utils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testIsEven_FalseCases(int number) {
        assertFalse(utils.isEven(number));
    }
}
