package com.hackerrank.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/magic-square-forming/problem
 */
public class FormingAMagicSquare {

    /**
     * Complete the formingMagicSquare function in the editor below. It should return an integer that represents the
     * minimal total cost of converting the input square to a magic square.
     * <p>
     * formingMagicSquare has the following parameter(s):
     *
     * @param s an array of integers
     */
    static int formingMagicSquare(int[][] s) {

        printSquare(s);

        int[] sumOfRows = new int[s.length];
        int[] sumOfColumns = new int[s.length];
        int[] sumOfDiagonals = new int[2];

        int cost = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                sumOfRows[i] += s[i][j];
                sumOfColumns[j] += s[i][j];
                if (i == j) {
                    sumOfDiagonals[0] += s[i][j];
                }
                if (i + j == s.length - 1) {
                    sumOfDiagonals[1] += s[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(sumOfRows));
        System.out.println(Arrays.toString(sumOfColumns));
        System.out.println(Arrays.toString(sumOfDiagonals));

//        System.out.println(areSumsEven(sumOfDiagonals));
//        int[] test = new int[]{2, 2, 2, 2, 2};
//        System.out.println(areSumsEven(test));

        System.out.println("magic number candidate (rows) = " + getMagicNumberCandidate(sumOfRows));
        System.out.println("magic number candidate (columns) = " + getMagicNumberCandidate(sumOfColumns));
        System.out.println("magic number candidate (diagonals) = " + getMagicNumberCandidate(sumOfDiagonals));

        return cost;
    }

    static int getMagicNumberCandidate(int[] s) {
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int value : s) {
            if (numbersMap.containsKey(value)) {
                numbersMap.put(value, numbersMap.get(value) + 1);
            } else {
                numbersMap.put(value, 1);
            }
        }

        Map<Integer, Integer> sortedMap = numbersMap.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        if (sortedMap.entrySet().iterator().next().getValue() > 1) {
            return sortedMap.entrySet().iterator().next().getKey();
        } else {
            return 0;
        }
    }

    static int[] getSumOfRows(int[][] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                result[i] += s[i][j];
            }
        }
        return result;
    }

    static int[] getSumOfColumns(int[][] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                result[j] += s[i][j];
            }
        }
        return result;
    }

    static int[] getSumOfDiagonals(int[][] s) {
        int[] result = new int[2];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i == j) {
                    result[0] += s[i][j];
                }
                if (i + j == s.length - 1) {
                    result[1] += s[i][j];
                }
            }
        }
        return result;
    }

    static boolean areSumsEven(int[] arr) {
        int prevValue = arr[0];
        for (int value : arr) {
            if (value != prevValue) {
                return false;
            }
            prevValue = value;
        }
        return true;
    }

    static void printSquare(int[][] s) {
        for (int[] row : s) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // should print 1
        System.out.println(formingMagicSquare(new int[][]{{4, 9, 2},
                {3, 5, 7},
                {8, 1, 5}}));

        // should print 4
        System.out.println(formingMagicSquare(new int[][]{{4, 8, 2},
                {4, 5, 7},
                {6, 1, 6}}));
    }
}
