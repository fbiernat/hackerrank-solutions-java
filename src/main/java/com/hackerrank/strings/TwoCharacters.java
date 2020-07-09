package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;

public class TwoCharacters {

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab") == 5);
        System.out.println(alternate("asdcbsdcagfsdbgdfanfghbsfdab") == 8);
        System.out.println(alternate("asvkugfiugsalddlasguifgukvsa") == 0);
    }

    static int alternate(String s) {
        List<Character> characterList = getUniqueCharactersInString(s);
        int maxLength = 0;

        for (int i = 0; i < characterList.size() - 1; i++) {
            for (int j = i + 1; j < characterList.size(); j++) {
                char c1 = characterList.get(i);
                char c2 = characterList.get(j);
                String testString = getTwoCharactersString(s, c1, c2);
                if (hasConsecutiveChars(testString)) {
                    continue;
                }
                if (testString.length() > maxLength) {
                    maxLength = testString.length();
                }
            }
        }
        return maxLength;
    }

    private static String getTwoCharactersString(String s, Character c1, Character c2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == c1 || c == c2) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private static List<Character> getUniqueCharactersInString(String s) {
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!characters.contains(c)) {
                characters.add(c);
            }
        }
        return characters;
    }

    static boolean hasConsecutiveChars(String s) {
        char prevChar = ' ';
        for (char character : s.toCharArray()) {
            if (character == prevChar) {
                return true;
            }
            prevChar = character;
        }
        return false;
    }
}
