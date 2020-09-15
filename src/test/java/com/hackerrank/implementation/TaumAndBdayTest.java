package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class TaumAndBdayTest {

    @Test
    public void testTaumAndBday() {
        Assert.assertEquals(20, TaumAndBday.taumBday(10, 10, 1, 1, 1));
    }

    @Test
    public void testTaumAndBday1() {
        Assert.assertEquals(37, TaumAndBday.taumBday(5, 9, 2, 3, 4));
    }

    @Test
    public void testTaumAndBday2() {
        Assert.assertEquals(12, TaumAndBday.taumBday(3, 6, 9, 1, 1));
    }

    @Test
    public void testTaumAndBday3() {
        Assert.assertEquals(35, TaumAndBday.taumBday(7, 7, 4, 2, 1));
    }

    @Test
    public void testTaumAndBday4() {
        Assert.assertEquals(12, TaumAndBday.taumBday(3, 3, 1, 9, 2));
    }

    @Test
    public void testTaumAndBday5() {
        Assert.assertEquals(29, TaumAndBday.taumBday(3, 5, 3, 4, 1));
    }

}
