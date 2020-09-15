package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/taum-and-bday/problem
 * <p>
 * Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants
 * from Taum: one is black and the other is white. To make her happy, Taum has to buy b black gifts and w white gifts.
 * <p>
 * - The cost of each black gift is bc units.
 * - The cost of every white gift is wc units.
 * - The cost of converting each black gift into white gift or vice versa is z units.
 * Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.
 * <p>
 * For example, if Taum wants to buy b = 3 black gifts and w = 5 white gifts at a cost of bc = 3, wc = 4 and
 * conversion cost z = 1 , we see that he can buy a black gift for 3 and convert it to a white gift for 1, making the
 * total cost of each white gift 4. That matches the cost of a white gift, so he can do that or just buy black gifts
 * and white gifts. Either way, the overall cost is 3 * 3 + 5 * 4 = 29
 */
public class TaumAndBday {

    /**
     * Complete the function taumBday in the editor below. It should return the minimal cost of obtaining the desired
     * gifts.
     * <p>
     * taumBday has the following parameter(s):
     *
     * @param b  the number of black gift
     * @param w  the number of white gifts
     * @param bc the cost of a black gift
     * @param wc the cost of a white gift
     * @param z  the cost to convert one color gift to the other color
     * @return minimal cost of obtaining the desired gifts
     */
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long totalCost = b * bc + w * wc;
        long cost = 0L;

        if (bc > wc + z) {
            // buy white gifts and convert to black gifts
            cost += (w + b) * wc;
            cost += b * z;
        } else if (wc > bc + z) {
            // buy black gifts and convert to white gifts
            cost += (w + b) * bc;
            cost += w * z;
        } else {
            // there is no reason to convert gifts
            cost = totalCost;
        }
        return cost;
    }


    public static void main(String[] args) {
        System.out.println(taumBday(10, 10, 1, 1, 1));          // 20
        System.out.println(taumBday(5, 9, 2, 3, 4));            // 37
        System.out.println(taumBday(3, 6, 9, 1, 1));            // 12
        System.out.println(taumBday(7, 7, 4, 2, 1));            // 35
        System.out.println(taumBday(3, 3, 1, 9, 2));            // 12
        System.out.println(taumBday(3, 5, 3, 4, 1));            // 29


        System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));      // 18192035842
        System.out.println(taumBday(95677, 39394, 86983, 311224, 588538));      // 20582630747
        System.out.println(taumBday(68406, 12718, 532909, 315341, 201009));     // 39331944938
        System.out.println(taumBday(15242, 95521, 712721, 628729, 396706));     // 70920116291
        System.out.println(taumBday(21988, 67781, 645748, 353796, 333199));     // 38179353700
        System.out.println(taumBday(22952, 80129, 502975, 175136, 340236));     // 25577754744
        System.out.println(taumBday(38577, 3120, 541637, 57823, 735060));       // 22947138309
        System.out.println(taumBday(5943, 69851, 674453, 392925, 381074));      // 31454478354
        System.out.println(taumBday(62990, 61330, 310144, 12251, 93023));       // 38686324390
        System.out.println(taumBday(11152, 43844, 788543, 223872, 972572));     // 18609275504
    }
}
