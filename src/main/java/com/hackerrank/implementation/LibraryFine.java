package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/library-fine/problem
 * <p>
 * Your local library needs your help! Given the expected and actual return dates for a library book, create a
 * program that calculates the fine (if any). The fee structure is as follows:
 * <p>
 * 1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
 * 2. If the book is returned after the expected return day but still within the same calendar month and year as the
 * expected return date, fine = 15 Hackos * (the number of days late).
 * 3. If the book is returned after the expected return month but still within the same calendar year as the expected
 * return date, the fine = 500 Hackos * (the number of months late).
 * 4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
 * <p>
 * Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1,
 * 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be 10,000
 * Hackos.
 */
public class LibraryFine {

    /**
     * Complete the libraryFine function in the editor below. It must return an integer representing the fine due.
     * <p>
     * libraryFine has the following parameter(s):
     *
     * @param d1 returned date day
     * @param m1 returned date month
     * @param y1 returned date year
     * @param d2 due date day
     * @param m2 due date month
     * @param y2 due date year
     * @return an integer representing the fine due
     */
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) {
            return 10000;
        } else if (y1 < y2) {
            return 0;
        } else {
            if (m1 > m2) {
                return 500 * Math.abs(m1 - m2);
            } else {
                if (d1 > d2 && m1 == m2) {
                    return 15 * Math.abs(d1 - d2);
                }
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));        // 45
        System.out.println(libraryFine(6, 6, 2015, 9, 6, 2016));        // 0
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));        // 0
        System.out.println(libraryFine(28, 2, 2015, 15, 4, 2015));      // 0
    }

}
