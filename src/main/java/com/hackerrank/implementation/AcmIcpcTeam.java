package com.hackerrank.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/acm-icpc-team/problem
 * <p>
 * There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a
 * number of topics. Given a list of topics known by each attendee, you must determine the maximum number of topics a
 * 2-person team can know. Also find out how many ways a team can be formed to know that many topics. Lists will be
 * in the form of bit strings, where each string represents an attendee and each position in that string represents a
 * field of knowledge, 1 if its a known field or 0 if not.
 */
public class AcmIcpcTeam {

    /**
     * Complete the acmTeam function in the editor below. It should return an integer array with two elements: the
     * maximum number of topics any team can know and the number of teams that can be formed that know that maximum
     * number of topics.
     * <p>
     * acmTeam has the following parameter(s):
     *
     * @param topic a string of binary digits
     * @return an integer array with two elements: the maximum number of topics any team can know and the number of
     * teams that can be formed that know that maximum number of topics.
     */
    static int[] acmTeam(String[] topic) {
        Map<Integer, Integer> teamsMap = new HashMap<>();
        int maxTopics = Integer.MIN_VALUE;

        int teamId = 0;
        // check all permutations of team composition
        for (int i = 0; i < topic.length - 1; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                String member1 = topic[i];
                String member2 = topic[j];
                int knownTopics = getTeamKnownTopics(member1, member2);
                // Populate map of topics known by teams
                teamsMap.put(teamId++, knownTopics);
                // Find maximum of topics that can be known by a team
                if (knownTopics > maxTopics) {
                    maxTopics = knownTopics;
                }
            }
        }

        int finalMaxTopics = maxTopics;
        int sumOfTeamsWithMaxTopics =
                (int) teamsMap.entrySet().stream().filter(e -> e.getValue().equals(finalMaxTopics)).count();

        return new int[]{maxTopics, sumOfTeamsWithMaxTopics};
    }

    private static int getTeamKnownTopics(String member1, String member2) {
        if (member1.length() != member2.length()) {
            return -1;
        }

        char[] m1topics = member1.toCharArray();
        char[] m2topics = member2.toCharArray();

        int count = 0;
        for (int i = 0; i < m1topics.length; i++) {
            if (m1topics[i] == '1' || m2topics[i] == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
        System.out.println(Arrays.toString(acmTeam(new String[]{"11101", "10101", "11001", "10111", "10000", "01110"})));
    }

}
