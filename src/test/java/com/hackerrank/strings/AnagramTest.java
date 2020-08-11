package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void testAnagram1() {
        Assert.assertEquals(3, Anagram.anagram("aaabbb"));
    }

    @Test
    public void testAnagram2() {
        Assert.assertEquals(1, Anagram.anagram("ab"));
    }

    @Test
    public void testAnagram3() {
        Assert.assertEquals(-1, Anagram.anagram("abc"));
    }

    @Test
    public void testAnagram4() {
        Assert.assertEquals(2, Anagram.anagram("mnop"));
    }

    @Test
    public void testAnagram5() {
        Assert.assertEquals(0, Anagram.anagram("xyyx"));
    }

    @Test
    public void testAnagram6() {
        Assert.assertEquals(1, Anagram.anagram("xaxbbbxx"));
    }

    @Test
    public void testAnagram7() {
        Assert.assertEquals(3, Anagram.anagram("asdfjoieufoa"));
    }

    @Test
    public void testAnagram8() {
        Assert.assertEquals(5, Anagram.anagram("fdhlvosfpafhalll"));
    }

    @Test
    public void testAnagram9() {
        Assert.assertEquals(5, Anagram.anagram("mvdalvkiopaufl"));
    }

}
