package com.hackerrank.sorting;

public class InsertionSort2 {

    public static void main(String[] args) {
        insertionSort2(6, new int[]{1});
        System.out.println();
        insertionSort2(6, new int[] {1, 4, 3, 5, 6, 2});
        System.out.println();
        insertionSort2(6, new int[] {8, 7, 6, 5, 4, 3, 2, 1});
    }

    static void insertionSort2(int n, int[] arr) {
        if (arr.length == 1) {
            printArray(arr);
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                printArray(arr);
                continue;
            }

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
            printArray(arr);
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
