package com.hackerrank.implementation;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 * <p>
 * Karl has an array of integers. He wants to reduce the array until all remaining elements are equal. Determine the
 * minimum number of elements to delete to reach his goal.
 * <p>
 * For example, if his array is arr = [1, 2, 2, 3], we see that he can delete the 2 elements 1 and 3 leaving
 * arr = [2, 2].
 * He could also delete both twos and either the 1 or the 3, but that would take 3 deletions. The minimum number of
 * deletions is 2.
 */
public class EqualizeTheArray {

    /**
     * Complete the equalizeArray function in the editor below. It must return an integer that denotes the minimum
     * number of deletions required.
     * <p>
     * equalizeArray has the following parameter(s):
     *
     * @param arr an array of integers
     * @return an integer that denotes the minimum number of deletions required
     */
    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        for (int value : arr) {
            if (frequencyMap.containsKey(value)) {
                frequencyMap.replace(value, frequencyMap.get(value) + 1);
            } else {
                frequencyMap.put(value, 1);
            }
        }

        int mostFrequentValue = frequencyMap.entrySet().stream().max(
                (entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).orElse(null).getValue();

        // Delete all elements that are not the most frequent value
        return arr.length - mostFrequentValue;
    }


    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));                    // 2
        System.out.println(equalizeArray(new int[]{1, 2, 3, 1, 2, 3, 3, 3}));           // 4
    }

}
