package com.hackerrank.problemsolving.warmup;

import java.util.Arrays;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(new int[] {3, 2, 1, 3}));
    }

    static int birthdayCakeCandles(int[] ar) {
        int max = 0;
        int numberOfCandles = 0;

        Arrays.sort(ar);
        max = ar[ar.length - 1];

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == max) {
                numberOfCandles++;
            } else {
                break;
            }
        }

        return numberOfCandles;
    }
}
