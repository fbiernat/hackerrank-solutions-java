package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 * <p>
 * Lily likes to play games with integers. She has created a new game where she determines the difference between a
 * number and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120
 * reversed is 21, and their difference is 99.
 * <p>
 * She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a
 * movie on a beautiful day.
 * <p>
 * Given a range of numbered days, [i...j] and a number k, determine the number of days in the range that are beautiful.
 * Beautiful numbers are defined as numbers where [i - reverse(i)] is evenly divisible by k. If a day's value is a
 * beautiful number, it is a beautiful day. Print the number of beautiful days in the range.
 */
public class BeautifulDaysAtTheMovies {

    /**
     * Complete the beautifulDays function in the editor below. It must return the number of beautiful days in the
     * range.
     * <p>
     * beautifulDays has the following parameter(s):
     *
     * @param i the starting day number
     * @param j the ending day number
     * @param k the divisor
     * @return he number of beautiful days in the range
     */
    static int beautifulDays(int i, int j, int k) {
        int numberOfBeautifulDays = 0;
        for (int d = i; d <= j; d++) {
            if (Math.abs(d - reverse(d)) % k == 0) {
                numberOfBeautifulDays++;
            }
        }
        return numberOfBeautifulDays;
    }

    static int reverse(int n) {
        try {
            return Integer.parseInt(reverse(String.valueOf(n)));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6)); // output: 2
    }
}
