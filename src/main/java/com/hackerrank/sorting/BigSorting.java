package com.hackerrank.sorting;

import java.util.Arrays;

public class BigSorting {

    public static void main(String[] args) {
        printlnArray(bigSorting(new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"}));

        printlnArray(bigSorting(new String[]{"1", "2", "100", "12303479849857341718340192371", "3084193741082937",
                "3084193741082938", "111", "200"}));
    }

    static String[] bigSorting(String[] str) {
        Arrays.sort(str, (s1, s2) -> {
            if (s1.length() == s2.length()) return s1.compareTo(s2);
            return s1.length() - s2.length();
        });
        return str;
    }

    static void printlnArray(String[] in) {
        for (String s : in) {
            System.out.println(s);
        }
        System.out.println();
    }
}
