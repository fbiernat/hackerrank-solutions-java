package com.hackerrank.implementation;

import java.util.*;
import java.util.stream.Collectors;

public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3)));
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 5, 5, 3, 3, 3)));
    }

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdMap = new TreeMap<>();
        for (int bird : arr) {
            int numberOfSightings;
            if (birdMap.containsKey(bird)) {
                numberOfSightings = birdMap.get(bird) + 1;
            } else {
                numberOfSightings = 1;
            }
            birdMap.put(bird, numberOfSightings);
        }

        Map<Integer, Integer> sortedBirdMap = birdMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return sortedBirdMap.entrySet().iterator().next().getKey();
    }

}
