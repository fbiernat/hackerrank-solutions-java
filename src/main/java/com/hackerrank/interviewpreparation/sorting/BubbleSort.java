package com.hackerrank.interviewpreparation.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }
        }

        System.out.format("Array is sorted in %d swaps.\n", numberOfSwaps);
        System.out.format("First Element: %d\n", a[0]);
        System.out.format("Last Element: %d\n", a[a.length - 1]);
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        bubbleSort(new int[] {1, 2, 3});
        bubbleSort(new int[] {3, 2, 1});
        bubbleSort(new int[] {4, 2, 3, 1});
    }

}
