package com.hackerrank.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SherlockAndArrayTest {

    @Test
    public void testSherlockAndArrays1() {
        Assert.assertEquals("NO", SherlockAndArray.balancedSums(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testSherlockAndArrays2() {
        Assert.assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(1, 2, 3, 3)));
    }

    @Test
    public void testSherlockAndArrays3() {
        Assert.assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(1, 1, 4, 1, 1)));
    }

    @Test
    public void testSherlockAndArrays4() {
        Assert.assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(2, 0, 0, 0)));
    }

    @Test
    public void testSherlockAndArrays5() {
        Assert.assertEquals("YES", SherlockAndArray.balancedSums(Arrays.asList(0, 0, 2, 0)));
    }

}
