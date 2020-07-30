package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {

    @Test
    public void testAlternatingCharacters() {
        Assert.assertEquals(3, AlternatingCharacters.alternatingCharacters("AAAA"));
        Assert.assertEquals(4, AlternatingCharacters.alternatingCharacters("BBBBB"));
        Assert.assertEquals(0, AlternatingCharacters.alternatingCharacters("ABABABAB"));
        Assert.assertEquals(0, AlternatingCharacters.alternatingCharacters("BABABA"));
        Assert.assertEquals(4, AlternatingCharacters.alternatingCharacters("AAABBB"));
    }

    @Test
    public void testAlternatingCharacters2() {
        Assert.assertEquals(6, AlternatingCharacters.alternatingCharacters("AAABBBAABB"));
        Assert.assertEquals(4, AlternatingCharacters.alternatingCharacters("AABBAABB"));
        Assert.assertEquals(1, AlternatingCharacters.alternatingCharacters("ABABABAA"));
    }

    @Test
    public void testAlternatingCharacters3() {
        Assert.assertEquals(3, AlternatingCharacters.alternatingCharacters("ABBABBAA"));
    }

}
