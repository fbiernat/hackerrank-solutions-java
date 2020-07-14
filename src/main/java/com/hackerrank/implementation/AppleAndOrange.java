package com.hackerrank.implementation;

public class AppleAndOrange {

    public static void main(String[] args) {
        countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
        countApplesAndOranges(2, 3, 1, 5, new int[]{2}, new int[]{-2});
    }

    /**
     * Complete the countApplesAndOranges function in the editor below. It should print the number of apples and
     * oranges that land on Sam's house, each on a separate line.
     * <p>
     * countApplesAndOranges has the following parameter(s):
     *
     * @param s       integer, starting point of Sam's house location.
     * @param t       integer, ending location of Sam's house location.
     * @param a       integer, location of the Apple tree.
     * @param b       integer, location of the Orange tree.
     * @param apples  integer array, distances at which each apple falls from the tree.
     * @param oranges integer array, distances at which each orange falls from the tree.
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
