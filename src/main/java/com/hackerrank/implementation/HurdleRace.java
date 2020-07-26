package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class HurdleRace {

    /**
     * Complete the hurdleRace function in the editor below. It should return the minimum units of potion Dan needs
     * to drink to jump all of the hurdles.
     * <p>
     * hurdleRace has the following parameter(s):
     *
     * @param k      an integer denoting the height Dan can jump naturally
     * @param height an array of integers denoting the heights of each hurdle
     * @return minimum units of potion Dan needs to drink to jump all of the hurdles
     */
    static int hurdleRace(int k, int[] height) {
        int max = Integer.MIN_VALUE;
        for (int h : height) {
            if (h > max) {
                max = h;
            }
        }

        return k > max ? 0 : max - k;
    }

    public static void main(String[] args) {
        System.out.println(hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
        System.out.println(hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
    }
}
