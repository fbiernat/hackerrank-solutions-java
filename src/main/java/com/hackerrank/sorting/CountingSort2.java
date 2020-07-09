package com.hackerrank.sorting;

import java.util.Arrays;

public class CountingSort2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                countingSort(new int[]{63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53,
                        98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30,
                        27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78,
                        22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82,
                        67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33})
        ));
    }

    static int[] countingSort(int[] arr) {
        int max = 0;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }

        int[] count = new int[max + 1];
        for (int value : arr) {
            count[value]++;
        }

        int[] sorted = new int[arr.length];
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    sorted[k] = i;
                    k++;
                }
            }
        }
        return sorted;
    }

}
