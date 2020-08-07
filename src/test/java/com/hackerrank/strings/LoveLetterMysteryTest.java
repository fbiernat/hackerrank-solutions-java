package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class LoveLetterMysteryTest {

    @Test
    public void testLoveLetterMystery1() {
        Assert.assertEquals(2, LoveLetterMystery.theLoveLetterMystery("abc"));
        Assert.assertEquals(0, LoveLetterMystery.theLoveLetterMystery("abcba"));
        Assert.assertEquals(4, LoveLetterMystery.theLoveLetterMystery("abcd"));
        Assert.assertEquals(2, LoveLetterMystery.theLoveLetterMystery("cba"));
    }

    @Test
    public void testLoveLetterMystery2() {
        Assert.assertEquals(6, LoveLetterMystery.theLoveLetterMystery("lmnop"));
        Assert.assertEquals(36, LoveLetterMystery.theLoveLetterMystery("adslkfjas"));
        Assert.assertEquals(13, LoveLetterMystery.theLoveLetterMystery("bafhaef"));
        Assert.assertEquals(40, LoveLetterMystery.theLoveLetterMystery("ofrhase"));
    }

}
