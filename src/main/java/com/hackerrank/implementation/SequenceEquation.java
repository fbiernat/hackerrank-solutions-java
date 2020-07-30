package com.hackerrank.implementation;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {

    /**
     * Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of y.
     * <p>
     * permutationEquation has the following parameter(s):
     *
     * @param p an array of integers
     * @return an array of integers that represent the values of y
     */
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for (int i = 1; i <= p.length; i++) {
            int index = 0;
            for (int j = 0; j < p.length; j++) {
                if (p[j] == i) {
                    index = j;
                    break;
                }
            }
            for (int j = 0; j < p.length; j++) {
                if (p[j] == index + 1) {
                    result[i - 1] = j + 1;
                    System.out.println(j + 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{2, 3, 1})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{4, 3, 5, 1, 2})));
    }
}
