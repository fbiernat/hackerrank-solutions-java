package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class BeautifulBinaryStringTest {

    @Test
    public void testBeautifulBinaryString1() {
        Assert.assertEquals(2, BeautifulBinaryString.beautifulBinaryString("0101010"));
        Assert.assertEquals(0, BeautifulBinaryString.beautifulBinaryString("01100"));
        Assert.assertEquals(3, BeautifulBinaryString.beautifulBinaryString("0100101010"));
    }

    @Test
    public void testBeautifulBinaryString2() {
        Assert.assertEquals(10, BeautifulBinaryString.beautifulBinaryString(
                "010010101010001011010010011011010001110011111010100101" +
                "1001110111110000101011011111011001111100011101"));
    }

}
