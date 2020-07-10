package com.hackerrank.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
        System.out.println(birthday(Collections.singletonList(4), 4, 1));
        System.out.println(birthday(Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1), 18, 7));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int numberOfWays = 0;

        for (int i = 0; i < s.size(); i++) {
            int count = 0;
            int sum = 0;
            while (count < m && (i + count) < s.size()) {
                sum += s.get(i + count);
                if (sum == d && count == m - 1) {
                    numberOfWays++;
                    break;
                }
                count++;
            }
        }
        return numberOfWays;
    }

}
