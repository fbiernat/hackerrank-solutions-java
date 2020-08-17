package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class LibraryFineTest {

    @Test
    public void testLibraryFine1() {
        Assert.assertEquals(45, LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015));
    }

    @Test
    public void testLibraryFine2() {
        Assert.assertEquals(0, LibraryFine.libraryFine(6, 6, 2015, 9, 6, 2016));
    }

    @Test
    public void testLibraryFine3() {
        Assert.assertEquals(0, LibraryFine.libraryFine(2, 7, 1014, 1, 1, 1015));
    }

    @Test
    public void testLibraryFine4() {
        Assert.assertEquals(0, LibraryFine.libraryFine(28, 2, 2015, 15, 4, 2015));
    }

}
