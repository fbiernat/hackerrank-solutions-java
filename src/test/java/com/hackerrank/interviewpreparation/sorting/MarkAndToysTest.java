package com.hackerrank.interviewpreparation.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MarkAndToysTest {

    @Test
    public void testMarkAndToys1() {
        Assert.assertEquals(4, MarkAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }

    @Test
    public void testMarkAndToys2() {
        Assert.assertEquals(3, MarkAndToys.maximumToys(new int[]{1, 2, 3, 4}, 7));
    }

    @Test
    public void testMarkAndToys3() {
        Assert.assertEquals(3, MarkAndToys.maximumToys(new int[]{3, 7, 2, 9, 4}, 15));
    }

}
