package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class ViralAdvertisingTest {

    @Test
    public void viralAdvertisingTest() {
        Assert.assertEquals(9, ViralAdvertising.viralAdvertising(3));
        Assert.assertEquals(15, ViralAdvertising.viralAdvertising(4));
    }

}
