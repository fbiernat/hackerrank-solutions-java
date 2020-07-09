package com.hackerrank.problemsolving.warmup;

public class PlusMinus {

    public static void main(String[] args) {
        plusMinus(new int[] {-4, 3, -9, 0, 4, 1});
    }

    static void plusMinus(int[] arr) {
        int plus = 0;
        int minus = 0;
        int zeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                plus++;
            } else if (arr[i] < 0) {
                minus++;
            } else {
                zeros++;
            }
        }

        System.out.println((float) plus / arr.length);
        System.out.println((float) minus / arr.length);
        System.out.println((float) zeros / arr.length);

    }
}
