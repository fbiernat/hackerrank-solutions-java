package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 * <p>
 * John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation
 * moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's
 * abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a
 * number of times then determine the value of the element at a given position.
 * <p>
 * For each array, perform a number of right circular rotations and return the value of the element at a given index.
 * <p>
 * For example, array a = [3, 4, 5], number of rotations, k = 2 and indices to check, m = [1, 2].
 * First we perform the two rotations:
 * [3, 4, 5] -> [5, 3, 4] -> [4, 5, 3]
 * Now return the values from the zero-based indices 1 and 2 as indicated in the  array.
 * a[1] = 5
 * a[2] = 3
 */
public class CircularArrayRotation {

    /**
     * Complete the circularArrayRotation function in the editor below. It should return an array of integers
     * representing the values at the specified indices.
     * <p>
     * circularArrayRotation has the following parameter(s):
     *
     * @param a       an array of integers to rotate
     * @param k       an integer, the rotation count
     * @param queries an array of integers, the indices to report
     * @return an array of integers representing the values at the specified indices
     */
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for (int i = 0; i < k; i++) {
            int lastValue = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = lastValue;
        }

        for (int q : queries) {
            System.out.println(a[q]);
        }

        return a;
    }

    public static void main(String[] args) {
        circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2});
        circularArrayRotation(new int[]{39356, 87674, 16667, 54260, 43958, 70429, 53682, 6169, 87496, 66190, 90286,
                4912, 44792, 65142, 36183, 43856, 77633, 38902, 1407, 88185, 80399, 72940, 97555, 23941, 96271, 49288
                , 27021, 32032, 75662, 69161, 33581, 15017, 56835, 66599, 69277, 17144, 37027, 39310, 23312, 24523,
                5499, 13597, 45786, 66642, 95090, 98320, 26849, 72722, 37221, 28255, 60906}, 51, new int[]{47, 10, 12,
                13, 6, 29, 22, 17, 7, 3, 30, 45, 1, 21, 50, 17, 25, 42, 5, 6, 47, 2, 24, 1, 6, 14, 24, 43, 7, 2, 35,
                3, 13, 22, 16, 19, 0, 12, 10, 32, 41, 14, 1, 42, 35, 0, 9, 34, 17, 14, 15, 38, 17, 13, 40, 48, 27, 38
                , 41, 8, 14, 25, 11, 27, 47, 2, 20, 22, 39, 4, 28, 29, 43, 29, 21, 1, 4, 4, 10, 46, 43, 50, 33, 34,
                12, 47, 32, 13, 8, 47, 22, 23, 21, 33, 24, 43, 35, 19, 39, 24});
    }

}
