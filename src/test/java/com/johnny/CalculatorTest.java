package com.johnny;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {
    private Calculator classUnderTest;

    @BeforeAll
    static void setup(){
        System.out.println("Executing @BeforeAll method");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("Executing @AfterAll method");
    }

    @BeforeEach
    void beforeEachTestMethod(){
        System.out.println("Executing @BeforeEach method");
        classUnderTest = new Calculator();
    }

    @AfterEach
    void afterEachTestMethod(){
        System.out.println("Executing @AfterEach method");
        classUnderTest = null;
    }

    // Naming - test<System Under Test>_<Condition or State Change>_<Expected Result>
    @Test
    @DisplayName("Test 4/2 = 2")
    void testIntegerDivision_WhenFourIsDividedByTwo_ReturnsTwo(){
        // AAA
        // A - Arrange
        int numerator = 4;
        int denominator = 2;
        int expected = 2;

        // A - Act
        int actualResult = classUnderTest.integerDivision(numerator, denominator);

        // A - Assert
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Divide by zero - ArithmeticException")
    void testIntegerDivision_WhenDividendDividedByZero_ThrowArithmeticException(){
        int dividend = 4;
        int divisor = 0;
        String expectedMessage = "/ by zero";

        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> classUnderTest.integerDivision(dividend, divisor),
                "Should throw an Arithmetic Exception when divide by 0");

        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    @DisplayName("Test 30 - 6 = 24")
    void testIntegerSubtraction_WhenSixIsSubtractFrom30_Return24(){
        int result = classUnderTest.integerSubtraction(30, 6);
        assertEquals(24, result, () -> "Error message and stuff");
    }
}