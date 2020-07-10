package com.hackerrank.sorting;

public class RunningTimeOfAlgorithms {

    public static void main(String[] args) {
        System.out.println(runningTime(new int[] {2, 1, 3, 1, 2}));
        System.out.println(runningTime(new int[] {1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9}));
    }

    static int runningTime(int[] arr) {
        int numberOfShifts = 0;

        if (arr.length == 1) {
            return 0;
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
                numberOfShifts++;
                j--;
            }
        }
        return numberOfShifts;
    }

}
