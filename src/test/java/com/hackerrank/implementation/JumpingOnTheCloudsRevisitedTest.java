package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsRevisitedTest {

    @Test
    public void testJumpingOnTheCloudsRevisited1() {
        Assert.assertEquals(92, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    @Test
    public void testJumpingOnTheCloudsRevisited2() {
        Assert.assertEquals(80, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0},
                3));
    }

    @Test
    public void testJumpingOnTheCloudsRevisited3() {
        Assert.assertEquals(97, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0
                , 1, 1, 0, 1, 1, 1, 1, 1}, 19));
    }

}
