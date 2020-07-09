package com.hackerrank.problemsolving.warmup;

public class Staircase {

    public static void main(String[] args) {
        staircase(6);
    }

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j < (n - i - 1)) {
                    line.append(" ");
                } else {
                    line.append("#");
                }
            }
            System.out.println(line.toString());
        }
    }
}
