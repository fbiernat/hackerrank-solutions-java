package com.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * <p>
 * You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks,
 * discarding the shortest pieces until there are none left. At each iteration you will determine the length of the
 * shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that
 * shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.
 * <p>
 * Given the lengths of n sticks, print the number of sticks that are left before each iteration until there are none
 * left.
 * <p>
 * For example, there are n = 3 sticks of lengths arr = [1, 2, 3]. The shortest stick length is 1, so we cut that
 * length from the longer
 * two and discard the pieces of length 1. Now our lengths are arr = [1, 2]. Again, the shortest stick is of length
 * 1, so we cut that amount from the longer stick and discard those pieces. There is only one stick left, arr = [1],
 * so we discard that stick. Our lengths are answer = [3, 2, 1].
 */
public class CutTheSticks {

    /**
     * Complete the cutTheSticks function in the editor below. It should return an array of integers representing the
     * number of sticks before each cut operation is performed.
     * <p>
     * cutTheSticks has the following parameter(s):
     *
     * @param arr an array of integers representing the length of each stick
     * @return an array of integers representing the number of sticks before each cut operation is performed
     */
    static int[] cutTheSticks(int[] arr) {
        List<Integer> sticksCutCountList = new ArrayList<>();

        while (!isArrayEmpty(arr)) {
            // Find shortest stick
            int min = Integer.MAX_VALUE;
            for (int value : arr) {
                if (value < min && value != 0) {
                    min = value;
                }
            }

            // Cut sticks
            int cutCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] -= min;
                    cutCount++;
                }
            }
            // Add cut count to the list
            sticksCutCountList.add(cutCount);
        }

        // Create solution array
        int[] solution = new int[sticksCutCountList.size()];
        int i = 0;
        for (int value : sticksCutCountList) {
            solution[i] = value;
            i++;
        }

        return solution;
    }

    static boolean isArrayEmpty(int[] arr) {
        for (int value : arr) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));            // 6, 4, 2, 1
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1})));      // 8, 6, 4, 1
    }
}
