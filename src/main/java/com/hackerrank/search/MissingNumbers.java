package com.hackerrank.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Numeros the Artist had two lists that were permutations of one another. He was very proud. Unfortunately, while
 * transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the
 * missing numbers?
 * <p>
 * As an example, the array with some numbers missing, arr = [7, 2, 5, 3, 5, 3]. The original array of numbers
 * brr = [7, 2, 5, 4, 6, 3, 5, 5, 3]. The numbers missing are [4, 6].
 * <p>
 * Notes
 * <p>
 * If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is
 * the same. If that is not the case, then it is also a missing number.
 * You have to print all the missing numbers in ascending order.
 * Print each missing number once, even if it is missing multiple times.
 * The difference between maximum and minimum number in the second list is less than or equal to 100.
 */
public class MissingNumbers {

    /**
     * Complete the missingNumbers function in the editor below. It should return a sorted array of missing numbers.
     * <p>
     * missingNumbers has the following parameter(s):
     *
     * @param arr the array with missing numbers
     * @param brr the original array of numbers
     * @return sorted array of missing numbers
     */
    static int[] missingNumbers(int[] arr, int[] brr) {
        // Identify arrays
        int[] fullArr, missingArr;
        if (arr.length > brr.length) {
            fullArr = arr;
            missingArr = brr;
        } else {
            fullArr = brr;
            missingArr = arr;
        }

        // Fill Integer lists
        List<Integer> fullList = new ArrayList<>();
        List<Integer> missingList = new ArrayList<>();
        for (int number : fullArr) {
            fullList.add(number);
        }
        for (int number : missingArr) {
            missingList.add(number);
        }

        // Remove items that are in both lists, leaving only missing numbers
        for (Integer n : missingList) {
            fullList.remove(n);
        }

        // Sort missing numbers list
        Collections.sort(fullList);

        // Remove duplicates
        List<Integer> missingNumbersList = new ArrayList<>();
        int prevItem = Integer.MIN_VALUE;
        for (int number : fullList) {
            if (number != prevItem) {
                missingNumbersList.add(number);
            }
            prevItem = number;
        }

        // Create result array
        int[] result = new int[missingNumbersList.size()];
        for (int i = 0; i < missingNumbersList.size(); i++) {
            result[i] = missingNumbersList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingNumbers(new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206}
                , new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}))); // 204 205 206

        System.out.println(Arrays.toString(missingNumbers(new int[]{11, 4, 11, 7, 13, 4, 12, 11, 10, 14}
                , new int[]{11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12}))); // 3 7 8 10 12
    }

}
