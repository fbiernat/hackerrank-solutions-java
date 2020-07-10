package com.hackerrank.sorting;

public class FindTheMedian {

    public static void main(String[] args) {
        System.out.println(findMedian(new int[] {0, 1, 2, 4, 6, 5, 3}));
    }

    static int findMedian(int[] arr) {
        // sort input array
        int[] sorted = insertionSort(arr);

        int medianIndex = sorted.length / 2;;
        return sorted[medianIndex];
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
