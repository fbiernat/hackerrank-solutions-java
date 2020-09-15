package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 */
public class TheTimeInWords {

    /**
     * Complete the timeInWords function in the editor below. It should return a time string as described.
     * <p>
     * timeInWords has the following parameter(s):
     *
     * @param h an integer representing hour of the day
     * @param m an integer representing minutes after the hour
     * @return a time string as described
     */
    static String timeInWords(int h, int m) {
        if (m == 0) {
            return getNumberString(h) + " o' clock";
        }
        if (m < 30) {
            if (m == 15) {
                return "quarter past " + getNumberString(h);
            }
            return getNumberString(m) + (m == 1 ? " minute" : " minutes") + " past " + getNumberString(h);
        } else {
            if (m == 30) {
                return "half past " + getNumberString(h);
            }
            if (m == 45) {
                return "quarter to " + getNumberString(h + 1);
            }
            return getNumberString(60 - m) + (60 - m == 1 ? " minute" : " minutes") + " to " + getNumberString(h + 1);
        }
    }

    static String getNumberString(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return "twenty " + getNumberString(number - 20);
            case 30:
                return "thirty";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 47));         // thirteen minutes to six
        System.out.println(timeInWords(3, 0));          // three o' clock
        System.out.println(timeInWords(7, 15));         // quarter past seven
        System.out.println();

        System.out.println(timeInWords(5, 0));         // five o' clock
        System.out.println(timeInWords(5, 1));         // one minute past five
        System.out.println(timeInWords(5, 10));         // ten minutes past five
        System.out.println(timeInWords(5, 15));         // quarter past five
        System.out.println(timeInWords(5, 30));         // half past five
        System.out.println(timeInWords(5, 40));         // twenty minutes to six
        System.out.println(timeInWords(5, 45));         // quarter to six
        System.out.println(timeInWords(5, 28));         // twenty eight minutes past five
    }
    
}
