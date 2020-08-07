package com.hackerrank.strings;

public class PalindromeIndex {

    /**
     * Complete the palindromeIndex function in the editor below. It must return the index of the character to remove
     * or -1.
     * <p>
     * palindromeIndex has the following parameter(s):
     *
     * @param s a string to analyze
     * @return index of the character to remove or -1
     */
    static int palindromeIndex(String s) {
        int index = -1;

        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s)) {
                break;
            }
            String testString = s.substring(0, i) + s.substring(i + 1);

            if (isPalindrome(testString)) {
                index = i;
                break;
            }
        }

        return index;
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
        System.out.println(palindromeIndex("baa"));
        System.out.println(palindromeIndex("aaa"));
    }

}
