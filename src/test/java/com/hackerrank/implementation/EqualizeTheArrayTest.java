package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class EqualizeTheArrayTest {

    @Test
    public void testEqualizeTheArray1() {
        Assert.assertEquals(2, EqualizeTheArray.equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }

    @Test
    public void testEqualizeTheArray2() {
        Assert.assertEquals(4, EqualizeTheArray.equalizeArray(new int[]{1, 2, 3, 1, 2, 3, 3, 3}));
    }

}
