package com.hackerrank.strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/gem-stones/problem
 * <p>
 * John has collected various rocks. Each rock has various minerals embedded in it. Each type of mineral is designated
 * by a lowercase letter in the range ascii[a - z]. There may be multiple occurrences of a mineral in a rock. A
 * mineral is called
 * a gemstone if it occurs at least once in each of the rocks in John's collection.
 * <p>
 * Given a list of minerals embedded in each of John's rocks, display the number of types of gemstones he has in his
 * collection.
 * <p>
 * For example, the array of mineral composition strings arr = [abc, abc, bc]. The minerals b and c appear in each
 * composite, so there are 2 gemstones.
 */
public class Gemstones {

    /**
     * Complete the gemstones function in the editor below. It should return an integer representing the number of
     * gemstones found in the list of rocks.
     * <p>
     * gemstones has the following parameter(s):
     *
     * @param arr an array of strings
     * @return an integer representing the number of gemstones found in the list of rocks
     */
    static int gemstones(String[] arr) {

        // sort characters in each string
        String[] arrSorted = new String[arr.length];
        int i = 0;
        for (String s : arr) {
            List<String> letters = Arrays.stream(s.split("")).sorted(String::compareTo).collect(Collectors.toList());
            arrSorted[i] = String.join("", letters);
            i++;
        }

        // remove mineral (letters) duplicates
        String[] arrWithoutDuplicates = new String[arr.length];
        i = 0;
        for (String s : arrSorted) {
            String previousLetter = "";
            StringBuilder withoutDuplicates = new StringBuilder();
            for (String letter : s.split("")) {
                if (!letter.equals(previousLetter)) {
                    withoutDuplicates.append(letter);
                }
                previousLetter = letter;
            }
            arrWithoutDuplicates[i] = withoutDuplicates.toString();
            i++;
        }

        arr = arrWithoutDuplicates;

        // create map of minerals in stones to number of occurrences in each stone
        Map<String, Integer> mineralMap = new HashMap<>();
        for (String s : arr) {
            for (String mineral : s.split("")) {
                if (mineralMap.containsKey(mineral)) {
                    mineralMap.replace(mineral, mineralMap.get(mineral) + 1);
                } else {
                    mineralMap.put(mineral, 1);
                }
            }
        }

        // fill gemstones list with minerals occurring in all stones
        List<String> gemstonesList = new ArrayList<>();
        for (String key : mineralMap.keySet()) {
            if (mineralMap.get(key) == arr.length) {
                gemstonesList.add(key);
            }
        }

        // return size of gemstones list
        return gemstonesList.size();
    }

    public static void main(String[] args) {
        System.out.println(gemstones(new String[]{"abcdde", "baccd", "eeabg"})); // 2
        System.out.println(gemstones(new String[]{"basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd"})); // 4
        System.out.println(gemstones(new String[]{"vtrjvgbj", "mkmjyaeav", "sibzdmsk"})); // 0
    }
}
