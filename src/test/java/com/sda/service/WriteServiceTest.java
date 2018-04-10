package com.sda.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriteServiceTest {


    private WriterService writerService;

    @Before
    public void init() {
        this.writerService = new WriterService();
    }

    @Test
    public void WriterServiceTest () {
        String name = "Adam";

        // when
        String result = writerService.write(name);

        Assert.assertEquals("Hello, Adam.", result);
    }

    @Test
    public void testNullName() {
        // given

        String name = null;

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend.", result);
    }

    @Test
    public void testCapitalizeName() {
        String name = "ADAM";
        String result = writerService.write(name);

        Assert.assertEquals("HELLO, ADAM!", result);
    }

    @Test
    public void testEmptyName() {
        String name = "";
        Assert.assertEquals("Hello, my friend.", writerService.write(name));
    }

    @Test
    public void testBlankName() {
        String name = "        ";
        Assert.assertEquals("Hello, my friend.", writerService.write(name));
    }

    @Test
    public void testFewNames() {
        String name = "Adam,Bartek,John";
        Assert.assertEquals("Hello, Adam, Bartek and John." , writerService.write(name));
    }

    @Test
    public void testFewCapitalizedNames() {
        String name = "ADAM,BARTEK,JOHN";
        Assert.assertEquals("HELLO, ADAM, BARTEK AND JOHN!", writerService.write(name));
    }

}
