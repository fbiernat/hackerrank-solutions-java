package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 * <p>
 * Aerith is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be
 * thunderheads or cumulus clouds. Her character must jump from cloud to cloud until it reaches the start again.
 * <p>
 * To play, Aerith is given an array of clouds, c and an energy level e = 100. She starts from c[0] and uses 1 unit
 * of energy to make a jump of size k to cloud c[(i + k) % n]. If Aerith lands on a thundercloud, c[i] = 1, her
 * energy (e) decreases by 2 additional units. The game ends when Aerith lands back on cloud 0.
 * <p>
 * Given the values of n, k the configuration of the clouds as an array c, can you determine the final value of e
 * after the game ends?
 * <p>
 * For example, give c = [0, 0, 1, 0] and k = 2, the indices of her path are 0 -> 2 -> 0. Her energy level reduces by
 * 1 for each jump to 98. She landed on one thunderhead at an additional cost of 2 energy units. Her final energy
 * level is 96.
 * <p>
 * Note: Recall that % refers to the modulo operation. In this case, it serves to make the route circular. If Aerith
 * is at c[n - 1] and jumps 1, she will arrive at c[0].
 */
public class JumpingOnTheCloudsRevisited {

    /**
     * Complete the jumpingOnClouds function in the editor below. It should return an integer representing the energy
     * level remaining after the game.
     * <p>
     * jumpingOnClouds has the following parameter(s):
     *
     * @param c an array of integers representing cloud types
     * @param k an integer representing the length of one jump
     * @return an integer representing the energy level remaining after the game
     */
    static int jumpingOnClouds(int[] c, int k) {
        int energyLevel = 100;
        int i = k % c.length; // initial jump
        energyLevel -= c[i] * 2 + 1;
        while (i != 0) {
            i = (i + k) % c.length;
            energyLevel -= c[i] * 2 + 1;
        }

        return energyLevel;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1}, 19));
    }
}
