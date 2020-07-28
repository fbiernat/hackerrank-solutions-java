package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class SaveThePrisonerTest {

    @Test
    public void testSaveThePrisoner() {
        Assert.assertEquals(2, SaveThePrisoner.saveThePrisoner(5, 2, 1));
        Assert.assertEquals(3, SaveThePrisoner.saveThePrisoner(5, 2, 2));
        Assert.assertEquals(6, SaveThePrisoner.saveThePrisoner(7, 19, 2));
        Assert.assertEquals(3, SaveThePrisoner.saveThePrisoner(3, 7, 3));
        Assert.assertEquals(122129406, SaveThePrisoner.saveThePrisoner(352926151, 380324688, 94730870));
        Assert.assertEquals(23525398, SaveThePrisoner.saveThePrisoner(94431605, 679262176, 5284458));
    }

}
