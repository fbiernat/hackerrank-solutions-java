package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 * <p>
 * A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to
 * cancel class if fewer than some number of students are present when class starts. Arrival times go from on time
 * (arrivalTime <= 0)
 * to arrived late (arrivalTime > 0).
 * <p>
 * Given the arrival time of each student and a threshold number of attendees, determine if the class is canceled.
 */
public class AngryProfessor {

    /**
     * Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO
     * otherwise.
     * <p>
     * angryProfessor has the following parameter(s):
     *
     * @param k the threshold number of students
     * @param a an array of integers representing arrival times
     * @return YES if class is cancelled, or NO otherwise
     */
    static String angryProfessor(int k, int[] a) {
        int numberOfStudentsOnTime = 0;
        for (int time : a) {
            if (time <= 0) {
                numberOfStudentsOnTime++;
            }
        }
        return numberOfStudentsOnTime >= k ? "NO" : "YES";
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[] {-1, -3, 4, 2})); // output: YES
        System.out.println(angryProfessor(2, new int[] {0, -1, 2, 1}));  // output: NO
    }
}
