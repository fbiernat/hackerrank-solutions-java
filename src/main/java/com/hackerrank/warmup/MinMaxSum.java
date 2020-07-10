package com.hackerrank.warmup;

import java.util.Arrays;

public class MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(new int[] {1, 2, 3, 4, 5});
        miniMaxSum(new int[] {256741038, 623958417, 467905213, 714532089, 938071625});
    }

    static void miniMaxSum(int[] arr) {
        long min = 0;
        long max = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }

        System.out.println(min + " " + max);
    }
}
