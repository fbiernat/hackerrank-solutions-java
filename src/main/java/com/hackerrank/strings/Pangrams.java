package com.hackerrank.strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pangrams {

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static String pangrams(String s) {
        List<String> letters = new LinkedList<>(Arrays.asList(ALPHABET.split("")));

        for (char c : s.toCharArray()) {
            letters.remove(String.valueOf(Character.toLowerCase(c)));
        }

        return letters.isEmpty() ? "pangram" : "not pangram";
    }
}
