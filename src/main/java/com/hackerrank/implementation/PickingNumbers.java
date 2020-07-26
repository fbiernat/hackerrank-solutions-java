package com.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers {

    /**
     * Complete the pickingNumbers function in the editor below. It should return an integer that represents the
     * length of the longest array that can be created.
     * <p>
     * pickingNumbers has the following parameter(s):
     *
     * @param a an array of integers
     * @return integer that represents the length of the longest array that can be created.
     */
    public static int pickingNumbers(List<Integer> a) {
        if (a == null) {
            return -1;
        }
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < a.size() - 1; i++) {
            for (int k = 1; k < a.size() - i; k++) {
                subarrays.add(new ArrayList<>(Collections.singletonList(a.get(i))));
                for (int j = i + k; j < a.size(); j++) {
                    List<Integer> list = subarrays.get(subarrays.size() - 1);
                    if (Math.abs(a.get(j) - list.get(list.size() - 1)) < 2) {
                        list.add(a.get(j));
                    }
                }
            }
        }

        return subarrays.stream().mapToInt(List::size).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
        System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
        System.out.println(pickingNumbers(Arrays.asList(84, 43, 11, 41, 2, 99, 31, 32, 56, 53, 42, 14, 98, 27, 64, 57
                , 16, 33, 48, 21, 46, 61, 87, 90, 28, 12, 62, 49, 29, 77, 82, 70, 80, 89, 95, 52, 13, 19, 9, 79, 35,
                67, 51, 39, 7, 1, 66, 8, 17, 85, 71, 97, 34, 73, 75, 6, 91, 40, 96, 65, 37, 74, 20, 68, 23, 47, 76,
                55, 24, 3, 30, 22, 55, 5, 69, 86, 54, 50, 10, 59, 15, 4, 36, 38, 83, 60, 72, 63, 78, 58, 88, 93, 45,
                18, 94, 44, 92, 81, 25, 26)));
    }
}
