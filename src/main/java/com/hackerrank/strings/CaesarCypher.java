package com.hackerrank.strings;

import java.sql.SQLOutput;

public class CaesarCypher {

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
        System.out.println(caesarCipher("159357lcfd", 98));
    }

    static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        int maxChar = 'z';
        int minChar = 'a';

        System.out.println(minChar);

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int newVal = (((int) Character.toLowerCase(c) - minChar + k) % (maxChar - minChar + 1) + minChar);
                if (Character.isUpperCase(c)) {
                    stringBuilder.append(Character.toUpperCase((char) newVal));
                } else {
                    stringBuilder.append((char) newVal);
                }
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
