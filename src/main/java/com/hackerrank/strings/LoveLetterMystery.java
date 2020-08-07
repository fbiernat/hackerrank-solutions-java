package com.hackerrank.strings;

/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery/problem
 * <p>
 * James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides
 * to meddle with the letter. He changes all the words in the letter into palindromes.
 * <p>
 * To do this, he follows two rules:
 * <p>
 * 1. He can only reduce the value of a letter by 1, i.e. he can change d to c, but he cannot change c to d or d to b.
 * 2. The letter a may not be reduced any further.
 * <p>
 * Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations
 * required to convert a given string into a palindrome.
 * <p>
 * For example, given the string s = cde, the following two operations are performed: cde → cdd → cdc.
 */
public class LoveLetterMystery {

    /**
     * Complete the theLoveLetterMystery function in the editor below. It should return the integer representing the
     * minimum number of operations needed to make the string a palindrome.
     * <p>
     * theLoveLetterMystery has the following parameter(s):
     *
     * @param s a string
     * @return integer representing the minimum number of operations needed to make the string a palindrome
     */
    static int theLoveLetterMystery(String s) {
        int numberOfOperations = 0;
        for (int i = 0; i < Math.ceil(s.length() / 2.0); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length() - i - 1);
            numberOfOperations += Math.abs((int) c1 - (int) c2);
        }

        return numberOfOperations;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));        // 2
        System.out.println(theLoveLetterMystery("abcba"));      // 0
        System.out.println(theLoveLetterMystery("abcd"));       // 4
        System.out.println(theLoveLetterMystery("cba"));        // 2

        System.out.println(theLoveLetterMystery("lmnop"));      // 6
        System.out.println(theLoveLetterMystery("adslkfjas"));  // 36
        System.out.println(theLoveLetterMystery("bafhaef"));    // 13
        System.out.println(theLoveLetterMystery("ofrhase"));    // 40
    }
}
