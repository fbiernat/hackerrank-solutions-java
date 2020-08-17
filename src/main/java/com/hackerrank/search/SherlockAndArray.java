package com.hackerrank.search;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-array/problem
 * <p>
 * Watson gives Sherlock an array of integers. His challenge is to find an element of the array such that the sum of
 * all elements to the left is equal to the sum of all elements to the right. For instance, given the array
 * arr = [5, 6, 8, 11], 8 is between two subarrays that sum to 11. If your starting array is [1], that element
 * satisfies the rule as left and right sum to 0.
 * <p>
 * You will be given arrays of integers and must determine whether there is an element that meets the criterion.
 */
public class SherlockAndArray {

    /**
     * Complete the balancedSums function in the editor below. It should return a string, either YES if there is an
     * element meeting the criterion or NO otherwise.
     * <p>
     * balancedSums has the following parameter(s):
     *
     * @param arr an array of integers
     * @return a string, either YES if there is an element meeting the criterion or NO otherwise
     */
    static String balancedSums(List<Integer> arr) {
        // List size 1, left sum and right sum equals 0
        if (arr.size() == 1) {
            return "YES";
        }

        int leftSum = 0;
        int rightSum = 0;

        // Right sum for first index is sum of all elements minus first element
        for (int n : arr) {
            rightSum += n;
        }
        rightSum -= arr.get(0);

        // If sums are equal return "YES"
        if (leftSum == rightSum) {
            return "YES";
        }

        // For each index check sums
        for (int i = 1; i < arr.size() - 1; i++) {
            int prevElem = arr.get(i - 1);
            leftSum += prevElem;
            rightSum -= arr.get(i);
            if (leftSum == rightSum) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(balancedSums(Arrays.asList(1, 2, 3)));           // NO
        System.out.println(balancedSums(Arrays.asList(1, 2, 3, 3)));        // YES

        System.out.println(balancedSums(Arrays.asList(1, 1, 4, 1, 1)));     // YES
        System.out.println(balancedSums(Arrays.asList(2, 0, 0, 0)));        // YES
        System.out.println(balancedSums(Arrays.asList(0, 0, 2, 0)));        // YES
    }

}
