package com.hackerrank.sorting;

import java.util.Arrays;

public class Quicksort1Partition {

    public static void main(String[] args) {
        printArray(quickSort(new int[] {4, 5, 3, 7, 2}));
    }

    static int[] quickSort(int[] arr) {
        int pivot = arr[0];
        int[] result = new int[arr.length];
        int i = 0;

        for (int value : arr) {
            if (value < pivot) {
                result[i] = value;
                i++;
            }
        }

        for (int value : arr) {
            if (value == pivot) {
                result[i] = value;
                i++;
            }
        }

        for (int value : arr) {
            if (value > pivot) {
                result[i] = value;
                i++;
            }
        }

        return result;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
