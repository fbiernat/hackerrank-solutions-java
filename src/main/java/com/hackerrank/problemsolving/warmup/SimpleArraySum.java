package com.hackerrank.problemsolving.warmup;

public class SimpleArraySum {

    public static void main(String[] args) {
        System.out.println(simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
    }

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }

}
