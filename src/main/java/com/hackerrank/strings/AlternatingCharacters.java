package com.hackerrank.strings;

/**
 * https://www.hackerrank.com/challenges/alternating-characters/problem
 * <p>
 * You are given a string containing characters A and B only. Your task is to change it into a string such that there
 * are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.
 * <p>
 * Your task is to find the minimum number of required deletions.
 * <p>
 * For example, given the string s = AABAAB, remove an A at positions 0 and 3 to make s = ABAB in 2 deletions.
 */
public class AlternatingCharacters {

    /**
     * Complete the alternatingCharacters function in the editor below. It must return an integer representing the
     * minimum number of deletions to make the alternating string.
     * <p>
     * alternatingCharacters has the following parameter(s):
     *
     * @param s a string
     * @return n integer representing the minimum number of deletions to make the alternating string
     */
    static int alternatingCharacters(String s) {
        int deletionCount = 0;
        char previousCharacter = ' ';
        for (char c : s.toCharArray()) {
            if (c == previousCharacter) {
                deletionCount++;
            }
            previousCharacter = c;
        }
        return deletionCount;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));     // 3
        System.out.println(alternatingCharacters("BBBBB"));    // 4
        System.out.println(alternatingCharacters("ABABABAB")); // 0
        System.out.println(alternatingCharacters("BABABA"));   // 0
        System.out.println(alternatingCharacters("AAABBB"));   // 4
    }
}
