package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class AngryProfessorTest {

    @Test
    public void testAngryProfessor() {
        Assert.assertEquals("YES", AngryProfessor.angryProfessor(3, new int[]{-1, -3, 4, 2}));
        Assert.assertEquals("NO", AngryProfessor.angryProfessor(2, new int[]{0, -1, 2, 1}));
    }

}
