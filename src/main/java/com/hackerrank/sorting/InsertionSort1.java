package com.hackerrank.sorting;

public class InsertionSort1 {

    public static void main(String[] args) {
        insertionSort1(5, new int[] {2, 4, 6, 8, 3});
        insertionSort1(14, new int[] {1, 3, 5, 9, 13, 22, 27, 35, 46, 51, 55, 83, 87, 23});
        insertionSort1(14, new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 1});
    }

    static void insertionSort1(int n, int[] arr) {
        int val = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i -1] > val) {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = val;
                printArray(arr);
                break;
            }
            printArray(arr);
        }

        if (arr[0] > val) {
            arr[0] = val;
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
