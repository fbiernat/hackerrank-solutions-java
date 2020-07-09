package com.hackerrank.strings;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SOSSOT"));
        System.out.println(marsExploration("SOSSOSSOS"));
    }

    static int marsExploration(String s) {
        String message = "SOS";
        int alterationCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != message.charAt(i % message.length())) {
                alterationCounter++;
            }
        }
        return alterationCounter;
    }

}
