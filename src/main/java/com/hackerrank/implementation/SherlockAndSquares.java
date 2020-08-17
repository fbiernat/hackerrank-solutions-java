package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 * <p>
 * Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range
 * of integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints.
 * <p>
 * Note: A square integer is an integer which is the square of an integer, e.g. 1, 4, 9, 16, 25.
 * <p>
 * For example, the range is a = 24 and b = 49, inclusive. There are three square integers in the range: 25, 36 and 49.
 */
public class SherlockAndSquares {

    /**
     * Complete the squares function in the editor below. It should return an integer representing the number of
     * square integers in the inclusive range from a to b.
     * <p>
     * squares has the following parameter(s):
     *
     * @param a an integer, the lower range boundary
     * @param b an integer, the upper range boundary
     * @return n integer representing the number of square integers in the inclusive range from a to b
     */
    static int squares(int a, int b) {
        int squaresCount = 0;
        for (int i = a; i <= b; i++) {
            double sqrt = Math.sqrt(i);
            if (Math.round(sqrt) == sqrt) {
                squaresCount++;
            }
        }
        return squaresCount;
    }

    public static void main(String[] args) {
        System.out.println(squares(3, 9));              // 2
        System.out.println(squares(17, 24));            // 0

        System.out.println(squares(35, 70));            // 3
        System.out.println(squares(100, 1000));         // 22
    }

}
