package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SequenceEquationTest {

    @Test
    public void testSequenceEquation() {
        Assert.assertEquals(Arrays.toString(new int[]{2, 3, 1}), Arrays.toString(SequenceEquation.permutationEquation(new int[]{2, 3, 1})));
        Assert.assertEquals(Arrays.toString(new int[]{1, 3, 5, 4, 2}), Arrays.toString(SequenceEquation.permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }

}
