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
}
