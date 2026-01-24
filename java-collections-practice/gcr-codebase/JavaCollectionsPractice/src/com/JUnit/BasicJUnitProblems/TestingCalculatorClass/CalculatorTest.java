package com.JUnit.BasicJUnitProblems.TestingCalculatorClass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calc.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        Exception ex = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", ex.getMessage());
    }
}