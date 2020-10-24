package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class LisasWorkbookTests {

    @Test
    public void testLisasWorkbook1() {
        Assert.assertEquals(4, LisasWorkbook.workbook(5, 3, new int[]{4, 2, 6, 1, 10}));
    }

    @Test
    public void testLisasWorkbook2() {
        Assert.assertEquals(8, LisasWorkbook.workbook(10, 5, new int[]{3, 8, 15, 11, 14, 1, 9, 2, 24, 31}));
    }

}
