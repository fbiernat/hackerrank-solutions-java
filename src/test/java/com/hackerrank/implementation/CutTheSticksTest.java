package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CutTheSticksTest {

    @Test
    public void testCutTheSticks1() {
        Assert.assertEquals("[6, 4, 2, 1]", Arrays.toString(CutTheSticks.cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));
    }

    @Test
    public void testCutTheSticks2() {
        Assert.assertEquals("[8, 6, 4, 1]", Arrays.toString(CutTheSticks.cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2,
                1})));
    }

}
