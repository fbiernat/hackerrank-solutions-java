package com.hackerrank.strings;

public class SeparateTheNumbers {

    public static void main(String[] args) {
        separateNumbers("1234");
        separateNumbers("91011");
        separateNumbers("99100");
        separateNumbers("101103");
        separateNumbers("010203");
        separateNumbers("13");
        separateNumbers("1");
    }

    static void separateNumbers(String s) {

        if (s.length() < 2) {
            System.out.println("NO");
            return;
        }
        if (s.charAt(0) == '0') {
            System.out.println("NO");
            return;
        }

        String number, prevNumber = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {

        }
    }
}
