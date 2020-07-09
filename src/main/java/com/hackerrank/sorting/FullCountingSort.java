package com.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullCountingSort {

    public static void main(String[] args) {
        countSort(Arrays.asList(
                Arrays.asList("0", "ab"),
                Arrays.asList("6", "cd"),
                Arrays.asList("0", "ef"),
                Arrays.asList("6", "gh"),
                Arrays.asList("4", "ij"),
                Arrays.asList("0", "ab"),
                Arrays.asList("6", "cd"),
                Arrays.asList("0", "ef"),
                Arrays.asList("6", "gh"),
                Arrays.asList("0", "ij"),
                Arrays.asList("4", "that"),
                Arrays.asList("3", "be"),
                Arrays.asList("0", "to"),
                Arrays.asList("1", "be"),
                Arrays.asList("5", "question"),
                Arrays.asList("1", "or"),
                Arrays.asList("2", "not"),
                Arrays.asList("4", "is"),
                Arrays.asList("2", "to"),
                Arrays.asList("4", "the")
        ));
    }

    static void countSort(List<List<String>> arr) {
        int max = 0;
        int count = 0;
        for (List<String> l : arr) {
            count++;
            if (Integer.parseInt(l.get(0)) > max) {
                max = Integer.parseInt(l.get(0));
            }
        }

        List<List<String>> sorted = new ArrayList<>();
        for (int i = 0; i < max + 1; i++) {
            sorted.add(new ArrayList<>());
        }

        int i = 0;
        for (List<String> l : arr) {
            i++;
            if (i <= count / 2) {
                sorted.get(Integer.parseInt(l.get(0))).add("-");
            } else {
                sorted.get(Integer.parseInt(l.get(0))).add(l.get(1));
            }
        }

        for (List<String> l : sorted) {
            for (String s : l) {
                System.out.print(s + " ");
            }
        }
    }

}
