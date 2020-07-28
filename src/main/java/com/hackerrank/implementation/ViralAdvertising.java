package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 * <p>
 * HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise
 * it to exactly  people on social media.
 * <p>
 * On the first day, half of those 5 people (i.e., floor(5/2) = 2) like the advertisement and each shares it with 3
 * of their friends.
 * At the beginning of the second day, floor(5/2) * 3 = 2 * 3 = 6 people receive the advertisement.
 * <p>
 * Each day, floor(recipients / 2) of the recipients like the advertisement and will share it with 3 friends on the
 * following day. Assuming
 * nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day,
 * beginning with launch day as day 1.
 * <p>
 * For example, assume you want to know how many have liked the ad by the end of the 5th day.
 * <p>
 * Day Shared Liked Cumulative
 * 1      5     2       2
 * 2      6     3       5
 * 3      9     4       9
 * 4     12     6      15
 * 5     18     9      24
 * The cumulative number of likes is .
 */
public class ViralAdvertising {

    /**
     * Complete the viralAdvertising function in the editor below. It should return the cumulative number of people
     * who have liked the ad at a given time.
     * <p>
     * viralAdvertising has the following parameter(s):
     *
     * @param n the integer number of days
     * @return the cumulative number of people who have liked the ad at a given time
     */
    static int viralAdvertising(int n) {
        double shared = 5;
        double liked = 0;
        int cumulativeLikes = 0;
        for (int i = 1; i <= n; i++) {
            liked = Math.floor(shared / 2);
            cumulativeLikes += (int) liked;
            shared = Math.floor(shared / 2) * 3;
        }
        return cumulativeLikes;
    }

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3)); // output: 9
        System.out.println(viralAdvertising(4)); // output: 15
    }
}
