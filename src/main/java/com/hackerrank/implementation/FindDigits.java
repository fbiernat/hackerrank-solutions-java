package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/find-digits/problem
 * <p>
 * An integer d is a divisor of an integer n if the remainder of n / d = 0.
 * <p>
 * Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of
 * divisors occurring within the integer.
 * <p>
 * Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for n =
 * 111, 1 is a divisor of 111 each time it occurs so the answer is 3).
 */
public class FindDigits {

    /**
     * Complete the findDigits function in the editor below. It should return an integer representing the number of
     * digits of  that are divisors of d.
     * <p>
     * findDigits has the following parameter(s):
     *
     * @param n an integer to analyze
     * @return an integer representing the number of digits of  that are divisors of d
     */
    static int findDigits(int n) {
        int counter = 0;
        String numbers = String.valueOf(n);
        for (String s : numbers.split("")) {
            int number = Integer.parseInt(s);
            if (number != 0 && n % number == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(12));                 // 2
        System.out.println(findDigits(1012));               // 3
    }

}
