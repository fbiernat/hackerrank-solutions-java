package com.hackerrank.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IceCreamParlorTest {

    @Test
    public void testIceCreamParlor1() {
        Assert.assertEquals("[1, 4]",
                Arrays.toString(IceCreamParlor.icecreamParlor(4, new int[]{1, 4, 5, 3, 2})));
    }

    @Test
    public void testIceCreamParlor2() {
        Assert.assertEquals("[1, 2]",
                Arrays.toString(IceCreamParlor.icecreamParlor(4, new int[]{2, 2, 4, 3})));
    }

    @Test
    public void testIceCreamParlor3() {
        Assert.assertEquals("[2, 4]",
                Arrays.toString(IceCreamParlor.icecreamParlor(9, new int[]{1, 3, 4, 6, 7, 9})));
    }

    @Test
    public void testIceCreamParlor4() {
        Assert.assertEquals("[3, 4]",
                Arrays.toString(IceCreamParlor.icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8})));
    }

    @Test
    public void testIceCreamParlor5() {
        Assert.assertEquals("[1, 2]",
                Arrays.toString(IceCreamParlor.icecreamParlor(3, new int[]{1, 2})));
    }

}
