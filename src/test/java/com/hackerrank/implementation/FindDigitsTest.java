package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class FindDigitsTest {

    @Test
    public void testFindDigits() {
        Assert.assertEquals(2, FindDigits.findDigits(12));
    }

    @Test
    public void testFindDigits1() {
        Assert.assertEquals(3, FindDigits.findDigits(1012));
    }

}
