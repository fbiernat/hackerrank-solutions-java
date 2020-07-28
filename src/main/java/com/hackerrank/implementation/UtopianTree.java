package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 * <p>
 * The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its
 * height increases by 1 meter.
 * <p>
 * Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be
 * after n growth cycles?
 * <p>
 * For example, if the number of growth cycles is n = 5, the calculations are as follows:
 * <p>
 * Period  Height
 * 0          1
 * 1          2
 * 2          3
 * 3          6
 * 4          7
 * 5          14
 */
public class UtopianTree {

    /**
     * Complete the utopianTree function in the editor below. It should return the integer height of the tree after
     * the input number of growth cycles.
     * <p>
     * utopianTree has the following parameter(s):
     *
     * @param n an integer, the number of growth cycles to simulate
     * @return integer height of the tree after the input number of growth cycles
     */
    static int utopianTree(int n) {
        if (n == 0) {
            return 1;
        }

        int height = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                height *= 2;
            } else {
                height += 1;
            }
        }
        return height;
    }


    public static void main(String[] args) {
        System.out.println(utopianTree(0)); // output: 1
        System.out.println(utopianTree(1)); // output: 2
        System.out.println(utopianTree(4)); // output: 7
    }
}
