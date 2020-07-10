package com.hackerrank.implementation;

public class AppleAndOrange {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
        countApplesAndOranges(2, 3, 1, 5, new int[]{2}, new int[]{-2});
    }

    /**
     * Count amount of apples and oranges that fall on the house
     *
     * @param s       starting position of house
     * @param t       ending position of house
     * @param a       position of apple tree
     * @param b       position of orange tree
     * @param apples  list of distances of fallen apples from the tree
     * @param oranges list of distances of fallen oranges from the tree
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        // apples
        for (int i = 0; i < apples.length; i++) {
            // add distance from the apple tree
            apples[i] += a;
        }
        int appleCounter = 0;
        for (int value : apples) {
            if (value >= s && value <= t) {
                appleCounter++;
            }
        }
        System.out.println(appleCounter);
        // oranges
        for (int i = 0; i < oranges.length; i++) {
            // add distance from the orange tree
            oranges[i] += b;
        }
        int orangeCounter = 0;
        for (int value : oranges) {
            if (value >= s && value <= t) {
                orangeCounter++;
            }
        }
        System.out.println(orangeCounter);
    }

}
