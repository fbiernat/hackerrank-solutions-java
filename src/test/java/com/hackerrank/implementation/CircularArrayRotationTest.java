package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CircularArrayRotationTest {

    @Test
    public void testCircularArrayRotation() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 1}),
                Arrays.toString(CircularArrayRotation.circularArrayRotation(new int[]{1, 2, 3}, 2,
                        new int[]{0, 1, 2})));
    }

}
