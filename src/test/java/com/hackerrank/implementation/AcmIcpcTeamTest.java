package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AcmIcpcTeamTest {

    @Test
    public void testAcmIcpcTeam1() {
        Assert.assertEquals("[5, 2]", Arrays.toString(AcmIcpcTeam.acmTeam(new String[]{"10101", "11100", "11010",
                "00101"})));
    }

    @Test
    public void testAcmIcpcTeam2() {
        Assert.assertEquals("[5, 6]", Arrays.toString(AcmIcpcTeam.acmTeam(new String[]{"11101", "10101", "11001",
                "10111", "10000", "01110"})));
    }

}
