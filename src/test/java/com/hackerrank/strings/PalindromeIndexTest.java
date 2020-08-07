package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeIndexTest {

    @Test
    public void testPalindromeIndex() {
        Assert.assertEquals(3, PalindromeIndex.palindromeIndex("aaab"));
        Assert.assertEquals(0, PalindromeIndex.palindromeIndex("baa"));
        Assert.assertEquals(-1, PalindromeIndex.palindromeIndex("aaa"));
    }

}
