package com.hackerrank.strings;

/**
 * https://www.hackerrank.com/challenges/anagram/problem
 * <p>
 * Two words are anagrams of one another if their letters can be rearranged to form the other word.
 * <p>
 * In this challenge, you will be given a string. You must split it into two contiguous substrings, then determine
 * the minimum number of characters to change to make the two substrings into anagrams of one another.
 * <p>
 * For example, given the string 'abccde', you would break it into two parts: 'abc' and 'cde'. Note that all letters
 * have been used, the substrings are contiguous and their lengths are equal. Now you can change 'a' and 'b' in the
 * first substring to 'd' and 'e' to have 'dec' and 'cde' which are anagrams. Two changes were necessary.
 */
public class Anagram {

    /**
     * Complete the anagram function in the editor below. It should return the minimum number of characters to change
     * to make the words anagrams, or -1 if it's not possible.
     * <p>
     * anagram has the following parameter(s):
     *
     * @param s a string
     * @return minimum number of characters to change to make the words anagrams, or -1 if it's not possible
     */
    static int anagram(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int numberOfChanges = 0;

        char[] ca1 = s1.toCharArray();
        for (char c : ca1) {
            int index = s2.indexOf(c);
            if (index == -1) {
                numberOfChanges++;
            } else {
                s2 = s2.substring(0, index) + s2.substring(index + 1);
            }
        }

        return numberOfChanges;
    }

    public static void main(String[] args) {
        System.out.println(anagram("aaabbb"));      // 3
        System.out.println(anagram("ab"));          // 1
        System.out.println(anagram("abc"));         // -1
        System.out.println(anagram("mnop"));        // 2
        System.out.println(anagram("xyyx"));        // 0
        System.out.println(anagram("xaxbbbxx"));    // 1

        System.out.println(anagram("asdfjoieufoa"));        // 3
        System.out.println(anagram("fdhlvosfpafhalll"));    // 5
        System.out.println(anagram("mvdalvkiopaufl"));      // 5
    }

}
