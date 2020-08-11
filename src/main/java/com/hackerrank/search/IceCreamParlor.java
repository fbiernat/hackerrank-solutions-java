package com.hackerrank.search;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor/problem
 * <p>
 * Sunny and Johnny like to pool their money and go to the ice cream parlor. Johnny never buys the same flavor that
 * Sunny does. The only other rule they have is that they spend all of their money.
 * <p>
 * Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
 * <p>
 * For example, they have m = 6 to spend and there are flavors costing cost = [1, 3, 4, 5, 6]. The two flavors
 * costing 1 and 5 meet the criteria.
 * Using 1-based indexing, they are at indices 1 and 4.
 */
public class IceCreamParlor {

    /**
     * Complete the icecreamParlor function in the editor below. It should return an array containing the indices of
     * the prices of the two flavors they buy, sorted ascending.
     * <p>
     * icecreamParlor has the following parameter(s):
     *
     * @param m   an integer denoting the amount of money they have to spend
     * @param arr an integer array denoting the cost of each flavor of ice cream
     * @return an array containing the indices of the prices of the two flavors they buy, sorted ascending
     */
    static int[] icecreamParlor(int m, int[] arr) {

        int[] result = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == m) {
                    result[0] = Math.min(i + 1, j + 1);
                    result[1] = Math.max(i + 1, j + 1);
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(4, new int[]{1, 4, 5, 3, 2})));       // 1 4
        System.out.println(Arrays.toString(icecreamParlor(4, new int[]{2, 2, 4, 3})));          // 1 2

        System.out.println(Arrays.toString(icecreamParlor(9, new int[]{1, 3, 4, 6, 7, 9})));    // 2 4
        System.out.println(Arrays.toString(icecreamParlor(8, new int[]{1, 3, 4, 4, 6, 8})));    // 3 4
        System.out.println(Arrays.toString(icecreamParlor(3, new int[]{1, 2})));                // 1 2
    }
    
}
