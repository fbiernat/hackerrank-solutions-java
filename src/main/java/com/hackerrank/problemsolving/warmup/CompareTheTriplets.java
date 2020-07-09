package com.hackerrank.problemsolving.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {
        System.out.println(compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);

        if (a.isEmpty() || b.isEmpty() || a.size() != b.size()) {
            return Collections.emptyList();
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                result.set(1, result.get(1) + 1);
            } else if (a.get(i) > b.get(i)) {
                result.set(0, result.get(0) + 1);
            }
        }

        return result;
    }

}
