package com.hackerrank.implementation;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }

    /**
     * Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split.
     * Otherwise, it should print the integer amount of money that Brian owes Anna.
     * <p>
     * bonAppetit has the following parameter(s):
     *
     * @param bill an array of integers representing the cost of each item ordered
     * @param k    an integer representing the zero-based index of the item Anna doesn't eat
     * @param b    the amount of money that Anna contributed to the bill
     */
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumOfAllItems = bill.stream().reduce(0, Integer::sum);
        int annaBill = (sumOfAllItems - bill.get(k)) / 2;

        if (annaBill == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(sumOfAllItems / 2 - annaBill);
        }
    }

}
