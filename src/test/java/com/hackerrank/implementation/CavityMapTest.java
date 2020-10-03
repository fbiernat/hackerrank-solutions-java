package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class CavityMapTest {

    @Test
    public void testCavityMap1() {
        Assert.assertEquals(new String[]{"989", "1X1", "111"}, CavityMap.cavityMap(new String[]{"989", "191", "111"}));
    }

    @Test
    public void testCavityMap2() {
        Assert.assertEquals(new String[]{"1112", "1X12", "18X2", "1234"}, CavityMap.cavityMap(new String[]{"1112",
                "1912", "1892", "1234"}));
    }

    @Test
    public void testCavityMap3() {
        Assert.assertEquals(new String[]{"12", "12"}, CavityMap.cavityMap(new String[]{"12", "12"}));
    }

}
