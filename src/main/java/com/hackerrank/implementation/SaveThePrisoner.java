package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 * <p>
 * A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way
 * to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair
 * number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each
 * prisoner sequentially around the table until all have been distributed.
 * <p>
 * The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes
 * awful. Determine the chair number occupied by the prisoner who will receive that candy.
 * <p>
 * For example, there are 4 prisoners and 6 pieces of candy. The prisoners arrange themselves in seats numbered 1 to 4.
 * Let's suppose two is drawn from the hat. Prisoners receive candy at positions 2, 3, 4, 1, 2, 3. The prisoner to be
 * warned sits in chair number 3.
 */
public class SaveThePrisoner {

    /**
     * Complete the saveThePrisoner function in the editor below. It should return an integer representing the chair
     * number of the prisoner to warn.
     * <p>
     * saveThePrisoner has the following parameter(s):
     *
     * @param n an integer, the number of prisoners
     * @param m an integer, the number of sweets
     * @param s an integer, the chair number to begin passing out sweets from
     * @return an integer representing the chair number of the prisoner to warn
     */
    static int saveThePrisoner(int n, int m, int s) {
        return ((m - 1) + (s - 1)) % n + 1;
    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 1)); // output: 2
        System.out.println(saveThePrisoner(5, 2, 2)); // output: 3
        System.out.println(saveThePrisoner(7, 19, 2)); // output: 6
        System.out.println(saveThePrisoner(3, 7, 3)); // output: 3
        System.out.println(saveThePrisoner(352926151, 380324688, 94730870)); // output: 122129406
        System.out.println(saveThePrisoner(94431605, 679262176, 5284458)); // output: 23525398
    }
}
