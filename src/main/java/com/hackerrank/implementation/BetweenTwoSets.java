package com.hackerrank.implementation;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    }

    /**
     * Complete the getTotalX function in the editor below. It should return the number of integers that are betwen
     * the sets.
     * <p>
     * getTotalX has the following parameter(s):
     *
     * @param a an array of integers
     * @param b an array of integers
     * @return integer, the number of integers that are betwen the sets.
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for (int i = f, j = 2; i <= l; i = f * j, j++) {
            if (l % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int gcd(List<Integer> in) {
        int result = in.get(0);
        for (int i : in) {
            result = gcd(result, i);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    static int lcm(List<Integer> in) {
        int result = in.get(0);
        for (int i : in) {
            result = lcm(result, i);
        }
        return result;
    }

}
