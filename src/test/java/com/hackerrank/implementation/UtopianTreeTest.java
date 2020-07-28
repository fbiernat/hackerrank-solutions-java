package com.hackerrank.implementation;

import org.junit.Assert;
import org.junit.Test;

public class UtopianTreeTest {

    @Test
    public void testUtopianTree() {
        Assert.assertEquals(1, UtopianTree.utopianTree(0));
        Assert.assertEquals(2, UtopianTree.utopianTree(1));
        Assert.assertEquals(7, UtopianTree.utopianTree(4));
    }

}
