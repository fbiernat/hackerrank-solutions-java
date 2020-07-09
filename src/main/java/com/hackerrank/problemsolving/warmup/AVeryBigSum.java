package com.hackerrank.problemsolving.warmup;

public class AVeryBigSum {

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005}));
    }

    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long l : ar) {
            result += l;
        }
        return result;
    }
}
