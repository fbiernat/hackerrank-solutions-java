package com.hackerrank.strings;

/**
 * https://www.hackerrank.com/challenges/beautiful-binary-string/problem
 * <p>
 * Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring
 * "010".
 * <p>
 * In one step, Alice can change a 0 to a 1 or vice versa. Count and print the minimum number of steps needed to make
 * Alice see the string as beautiful.
 * <p>
 * For example, if Alice's string is b = 010 she can change any one element and have a beautiful string.
 */
public class BeautifulBinaryString {

    /**
     * Complete the beautifulBinaryString function in the editor below. It should return an integer representing the
     * minimum moves required.
     * <p>
     * beautifulBinaryString has the following parameter(s):
     *
     * @param b a string of binary digits
     * @return an integer representing the minimum moves required
     */
    static int beautifulBinaryString(String b) {
        int substringCount = 0;
        String substring = "010";
        int i = 0, j = 0;
        for (char c : b.toCharArray()) {
            if (c == substring.charAt(i)) {
                i++;
                if (i == 3) {
                    substringCount++;
                    i = 0;
                    System.out.println("End of substring index = " + j);
                }
            } else {
                i = 0;
            }
            j++;
        }
        return substringCount;
    }

    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0101010"));     // 2
        System.out.println(beautifulBinaryString("01100"));       // 0
        System.out.println(beautifulBinaryString("0100101010"));  // 3
        System.out.println(beautifulBinaryString("010010101010001011010010011011010001110011111010100101" +
                "1001110111110000101011011111011001111100011101"));  // 10
    }

}
