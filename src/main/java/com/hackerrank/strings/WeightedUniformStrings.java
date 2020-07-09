package com.hackerrank.strings;

import java.util.*;

public class WeightedUniformStrings {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(weightedUniformStrings("abccddde", new int[]{1, 3, 12, 5, 9, 10})));
        System.out.println(Arrays.toString(weightedUniformStrings("aaabbbbcccddd", new int[]{9, 7, 8, 12, 5})));
    }

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static Map<String, Integer> weightMap = createWeightMap();

    static Map<String, Integer> createWeightMap() {

        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < ALPHABET.length(); i++) {
            result.put(String.valueOf(ALPHABET.charAt(i)), i+1);
        }
        return result;
    }

    static String[] weightedUniformStrings(String s, int[] queries) {

        List<Integer> weights = new ArrayList<>();

        int i = 1;
        char prevChar = ' ';
        for (char c : s.toCharArray()) {
            if (c == prevChar) {
                i++;
            } else {
                i = 1;
            }
            weights.add(i * weightMap.get(String.valueOf(c)));
            prevChar = c;
        }

        String[] result = new String[queries.length];
        for (int j = 0; j < queries.length; j++) {
            if (weights.contains(queries[j])) {
                result[j] = "Yes";
            } else {
                result[j] = "No";
            }
        }

        return result;
    }

}
