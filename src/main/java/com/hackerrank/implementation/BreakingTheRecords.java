package com.hackerrank.implementation;

import java.util.Arrays;

public class BreakingTheRecords {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
        System.out.println(Arrays.toString(breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42})));
    }

    static int[] breakingRecords(int[] scores) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int bestCount = 0;
        int worstCount = 0;

        for (int score : scores) {
            if (score > max) {
                max = score;
                bestCount++;
            }
            if (score < min) {
                min = score;
                worstCount++;
            }
        }

        // ignore first record, first time record is set not broken
        bestCount--;
        worstCount--;

        return new int[]{bestCount, worstCount};
    }

}
