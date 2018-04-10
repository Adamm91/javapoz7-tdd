package com.sda.stringCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalTest {

    private StringCal stringCal;

    @Before
    public void init () {
        this.stringCal = new StringCal();
    }

    @Test
    public void sumTest () {
        Assert.assertEquals(5, stringCal.calculate("2;3"));
        Assert.assertEquals(6, stringCal.calculate("1;5"));
        Assert.assertEquals(14, stringCal.calculate("10;4"));
        Assert.assertEquals(37, stringCal.calculate("21;16"));
    }

    @Test
    public void IsNullTest() {
        Assert.assertEquals(0, stringCal.calculate(null));
    }

    @Test
    public void isBlankTest() {
        Assert.assertEquals(0, stringCal.calculate(""));
    }

    @Test
    public void oneNumberTest() {
        Assert.assertEquals(5, stringCal.calculate("5"));
    }

    @Test
    public void multipleNumbersTest() {
        Assert.assertEquals(24, stringCal.calculate("2;15;4;3"));
        Assert.assertEquals(27, stringCal.calculate("4;18;5"));
    }

    @Test
    public void isWhiteSpacesTest() {
        Assert.assertEquals(5, stringCal.calculate("2; 3"));
        Assert.assertEquals(12, stringCal.calculate("5; 7"));
    }

}
