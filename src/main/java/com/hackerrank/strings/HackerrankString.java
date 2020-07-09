package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;

public class HackerrankString {

    public static void main(String[] args) {
//        System.out.println(hackerrankInString("hereiamstackerrank"));
//        System.out.println(hackerrankInString("hackerworld"));
//        System.out.println(hackerrankInString("hhaacckkekraraannk"));
//        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));

        System.out.println(hackerrankInString("knarrekcah"));
        System.out.println(hackerrankInString("hackerrank"));
        System.out.println(hackerrankInString("hackeronek"));
        System.out.println(hackerrankInString("hackeabcdefghijklmnopqrstuvwxyzronek"));
        System.out.println(hackerrankInString("rhackerank"));
        System.out.println(hackerrankInString("ahankercka"));
        System.out.println(hackerrankInString("hacakaeararanaka"));
        System.out.println(hackerrankInString("hhhhaaaaackkkkerrrrrrrrank"));
        System.out.println(hackerrankInString("crackerhackerknar"));
        System.out.println(hackerrankInString("hhhackkerbanker"));
    }

    static String hackerrankInString(String s) {
        List<Character> letters = new ArrayList<>();
        String word = "hackerrank";
        word.chars().forEach(c -> letters.add((char) c));

        for (char c : s.toCharArray()) {
            if (!letters.isEmpty() && c == letters.get(0)) {
                letters.remove(0);
            }
        }

        return letters.isEmpty() ? "YES" : "NO";
    }
}
