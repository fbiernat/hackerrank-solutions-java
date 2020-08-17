package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndSquaresTest {

    @Test
    public void testSherlockAndSquares1() {
        Assert.assertEquals(2, SherlockAndSquares.squares(3, 9));
    }

    @Test
    public void testSherlockAndSquares2() {
        Assert.assertEquals(0, SherlockAndSquares.squares(17, 24));
    }

    @Test
    public void testSherlockAndSquares3() {
        Assert.assertEquals(3, SherlockAndSquares.squares(35, 70));
    }

    @Test
    public void testSherlockAndSquares4() {
        Assert.assertEquals(22, SherlockAndSquares.squares(100, 1000));
    }

}
