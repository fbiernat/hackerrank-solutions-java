package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/funny-string/problem
 * <p>
 * In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny,
 * create a copy of the string in reverse e.g. abc -> cba. Iterating through each string, compare the absolute
 * difference in
 * the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute
 * differences is the same for both strings, they are funny.
 * <p>
 * Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
 */
public class FunnyString {

    /**
     * Complete the funnyString function in the editor below. For each test case, it should return a string, either
     * Funny or Not Funny.
     * <p>
     * funnyString has the following parameter(s):
     *
     * @param s a string to test
     * @return a string, either Funny or Not Funny.
     */
    static String funnyString(String s) {
        List<Integer> diffList = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            int difference = Math.abs((int) charArray[i] - (int) charArray[i - 1]);
            diffList.add(difference);
        }

        List<Integer> reversedDiffList = new ArrayList<>();
        String reversed = new StringBuilder(s).reverse().toString();
        char[] reversedCharArray = reversed.toCharArray();
        for (int i = 1; i < reversedCharArray.length; i++) {
            int difference = Math.abs((int) reversedCharArray[i] - (int) reversedCharArray[i - 1]);
            reversedDiffList.add(difference);
        }

        for (int i = 0; i < diffList.size(); i++) {
            if (!diffList.get(i).equals(reversedDiffList.get(i))) {
                return "Not Funny";
            }
        }

        return "Funny";
    }

    public static void main(String[] args) {
        System.out.println(funnyString("acxz")); // Funny
        System.out.println(funnyString("bcxz")); // Not Funny
    }
}
