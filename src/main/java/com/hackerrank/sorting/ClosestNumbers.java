package com.hackerrank.sorting;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumbers {

    public static void main(String[] args) {
        printArray(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30,
                6246457, -6461594, 266854}));

        printArray(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30,
                6246457, -6461594, 266854, -520, -470}));

        printArray(closestNumbers(new int[]{5, 4, 3, 2}));
    }

    static int[] closestNumbers(int[] arr) {
        // sort array
        int[] sorted = insertionSort(arr);
        // find minimum difference between elements of array
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < sorted.length - 1; i++) {
            if (Math.abs(sorted[i] - sorted[i + 1]) < minDifference) {
                minDifference = Math.abs(sorted[i] - sorted[i + 1]);
            }
        }
        // search for pairs with minimum difference between and add them to list
        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < sorted.length - 1; i++) {
            if (Math.abs(sorted[i] - sorted[i + 1]) == minDifference) {
                pairs.add(sorted[i]);
                pairs.add(sorted[i + 1]);
            }
        }
        // convert list to array
        int[] result = new int[pairs.size()];
        for (int i = 0; i < pairs.size(); i++) {
            result[i] = pairs.get(i);
        }

        return result;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Insertion sort from one of previous exercises
    static int[] insertionSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            }

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

}
