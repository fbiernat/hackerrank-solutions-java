package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class FunnyStringTest {

    @Test
    public void testFunnyString() {
        Assert.assertEquals("Funny", FunnyString.funnyString("acxz"));
        Assert.assertEquals("Not Funny", FunnyString.funnyString("bcxz"));
    }
    
}
