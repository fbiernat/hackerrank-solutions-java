package com.hackerrank.interviewpreparation.sorting;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem
 * <p>
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some.
 * There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain
 * amount to spend, and he wants to maximize the number of toys he buys with this money.
 */
public class MarkAndToys {

    /**
     * Complete the function maximumToys in the editor below. It should return an integer representing the maximum
     * number of toys Mark can purchase.
     * <p>
     * maximumToys has the following parameter(s):
     *
     * @param prices an array of integers representing toy prices
     * @param k      an integer, Mark's budget
     * @return an integer representing the maximum number of toys Mark can purchase
     */
    static int maximumToys(int[] prices, int k) {
        // sort toys prices array
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    // swap elements
                    swap(prices, j, j + 1);
                }
            }
        }

        // count how many least expensive toys can be bought with given budget
        int priceSum = 0;
        int toyCount = 0;
        for (int price : prices) {
            priceSum += price;
            if (priceSum >= k) {
                break;
            }
            toyCount++;
        }
        return toyCount;
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));               // 4
        System.out.println(maximumToys(new int[]{1, 2, 3, 4}, 7));                                  // 3
        System.out.println(maximumToys(new int[]{3, 7, 2, 9, 4}, 15));                              // 3

    }

}
