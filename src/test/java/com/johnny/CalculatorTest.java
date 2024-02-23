package com.johnny;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void integerDivisionTest(){
        Calculator classUnderTest = new Calculator();
        int result = classUnderTest.integerDivision(30, 6);
        assertEquals(5, result);
    }

    @Test
    void integerSubtraction(){
        Calculator classUnderTest = new Calculator();
        int result = classUnderTest.integerSubtraction(30, 6);
        assertEquals(24, result, () -> "Error message and stuff");
    }
}