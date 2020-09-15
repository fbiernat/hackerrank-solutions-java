package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class TheTimeInWordsTest {

    @Test
    public void testTheTimeInWords1() {
        Assert.assertEquals("thirteen minutes to six", TheTimeInWords.timeInWords(5, 47));
    }

    @Test
    public void testTheTimeInWords2() {
        Assert.assertEquals("three o' clock", TheTimeInWords.timeInWords(3, 0));
    }

    @Test
    public void testTheTimeInWords3() {
        Assert.assertEquals("quarter past seven", TheTimeInWords.timeInWords(7, 15));
    }

    @Test
    public void testTheTimeInWords4() {
        Assert.assertEquals("five o' clock", TheTimeInWords.timeInWords(5, 0));
    }

    @Test
    public void testTheTimeInWords5() {
        Assert.assertEquals("one minute past five", TheTimeInWords.timeInWords(5, 1));
    }

    @Test
    public void testTheTimeInWords6() {
        Assert.assertEquals("quarter past five", TheTimeInWords.timeInWords(5, 15));
    }

    @Test
    public void testTheTimeInWords7() {
        Assert.assertEquals("half past five", TheTimeInWords.timeInWords(5, 30));
    }

    @Test
    public void testTheTimeInWords8() {
        Assert.assertEquals("twenty minutes to six", TheTimeInWords.timeInWords(5, 40));
    }

    @Test
    public void testTheTimeInWords9() {
        Assert.assertEquals("quarter to six", TheTimeInWords.timeInWords(5, 45));
    }

    @Test
    public void testTheTimeInWords10() {
        Assert.assertEquals("twenty eight minutes past five", TheTimeInWords.timeInWords(5, 28));
    }

}
