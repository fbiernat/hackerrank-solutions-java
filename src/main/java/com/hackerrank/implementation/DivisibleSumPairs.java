package com.hackerrank.implementation;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2}));
    }

    static int divisibleSumPairs(int n, int k, int[] arr) {
        int numberOfPairs = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j && (arr[i] + arr[j]) % k == 0) {
                    numberOfPairs++;
                }
            }
        }

        return numberOfPairs;
    }

}
