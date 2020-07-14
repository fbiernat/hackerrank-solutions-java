package com.hackerrank.implementation;

public class DrawingBook {

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
    }

    /**
     * Complete the pageCount function in the editor below. It should return the minimum number of pages Brie must turn.
     * <p>
     * pageCount has the following parameter(s):
     *
     * @param n the number of pages in the book
     * @param p the page number to turn to
     * @return minimum number of pages Brie must turn
     */
    static int pageCount(int n, int p) {
        int frontPageCount = p / 2;
        int backPageCount = n / 2 - p / 2;

        return Math.min(frontPageCount, backPageCount);
    }

}
