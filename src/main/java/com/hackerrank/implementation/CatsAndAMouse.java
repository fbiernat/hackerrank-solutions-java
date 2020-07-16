package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatsAndAMouse {

    /**
     * Complete the catAndMouse function in the editor below. It should return one of the three strings as described.
     * <p>
     * catAndMouse has the following parameter(s):
     *
     * @param x an integer, Cat 's position
     * @param y an integer, Cat 's position
     * @param z an integer, Mouse 's position
     * @return one of the three strings as described
     */
    static String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(z - x);
        int catBDistance = Math.abs(z - y);
        if (catADistance < catBDistance) {
            return "Cat A";
        } else if (catADistance > catBDistance) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
    }
}
