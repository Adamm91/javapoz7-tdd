package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;


    // Given
    @Before
    public void init() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        // When
        int sum = calculator.sum(3, 5);

        // Then
        Assert.assertEquals(8, sum);
    }

    @Test
    public void testSub() {
        // When
        int sub = calculator.subtract(5, 2);

        // Then
        Assert.assertEquals(3, sub);
    }

    @Test
    public void testMultiply() {
        // When
        int mul = calculator.multiply(3, 5);

        // Then
        Assert.assertEquals(15, mul);
    }

    @Test
    public void testDivide() {
        // Given
        Calculator calculator = new Calculator();

        // Then
        Assert.assertEquals(3, calculator.divide(6, 2));
    }

}
