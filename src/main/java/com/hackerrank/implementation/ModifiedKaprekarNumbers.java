package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/kaprekar-numbers/problem
 * <p>
 * A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the
 * number into two integers and sum those integers, you have the same value you started with.
 * <p>
 * Consider a positive whole number n with d digits. We square n to arrive at a number that is either 2 * d digits
 * long or (2 * d) - 1 digits long. Split the string representation of the square into two parts, l and r. The right
 * hand part, r must be d digits long. The left is the remaining substring. Convert those two substrings back to
 * integers, add them and see if you get n.
 * <p>
 * For example, if n = 5, d = 1 then n^2 = 25. We split that into two strings and convert them back to integers 2 and
 * 5. We test 2 + 5 = 7 != 5, so this is not a modified Kaprekar number. If n = 9, still d = 1, and n^2 = 81. This
 * gives us 8 + 1 = 9, the original n.
 * <p>
 * Note: r may have leading zeros.
 * <p>
 * Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!):
 * <p>
 * In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square
 * in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar
 * number, because 45² = 2025 and 20+25 = 45.
 * <p>
 * Given two positive integers p and q where p is lower than q, write a program to print the modified Kaprekar
 * numbers in the range between p and q, inclusive.
 */
public class ModifiedKaprekarNumbers {

    /**
     * Complete the kaprekarNumbers function in the editor below. It should print the list of modified Kaprekar
     * numbers in ascending order.
     * <p>
     * kaprekarNumbers has the following parameter(s):
     *
     * @param p an integer
     * @param q an integer
     */
    static void kaprekarNumbers(int p, int q) {
        if (p <= 0 || q > 100000) {
            return;
        }
        int kaprekarNumberCount = 0;
        for (int number = p; number <= q; number++) {
            int digits = String.valueOf(number).length();
            String square = String.valueOf((long) number * number);
            String rightPart = square.substring(square.length() - digits);
            String leftPart = square.substring(0, square.length() - digits);

            if (leftPart.length() == 0) {
                leftPart = "0";
            }

            if (Integer.parseInt(leftPart) + Integer.parseInt(rightPart) == number) {
                // Modified Kaprekar Number, print it
                System.out.print(number + " ");
                kaprekarNumberCount++;
            }
        }
        if (kaprekarNumberCount == 0) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 100);            // 1 9 45 55 99
        kaprekarNumbers(100, 300);          // 297
        kaprekarNumbers(400, 700);          // INVALID RANGE
        kaprekarNumbers(1, 99999);          // 1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344
        // 22222 77778 82656 95121 99999
    }

}

