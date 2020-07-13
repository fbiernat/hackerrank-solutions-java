package com.hackerrank.implementation;

public class DayOfTheProgrammer {

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(1918));
    }

    static int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static String dayOfProgrammer(int year) {
        boolean isTransitionYear = false;
        int day = 0;
        int month = 0;

        if (year >= 1700 && year < 1918) {
            // julian calendar
            if (year % 4 == 0) {
                // is leap year
                daysInMonth[1] = 29;
            }
        } else if (year == 1918) {
            // transition year
            isTransitionYear = true;
            daysInMonth[1] = 28 - 13;
        } else if (year > 1919 && year <= 2700) {
            // gregorian calendar
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                // is leap year
                daysInMonth[1] = 29;
            }
        }

        int days = 256;
        for (int i = 0; i < daysInMonth.length; i++) {
            days -= daysInMonth[i];
            month = i + 1;
            if (days <= 0) {
                day = daysInMonth[i] + days;
                if (isTransitionYear && i == 1) {
                    day += 14;
                }
                break;
            }
        }

        return day + "." + (month < 10 ? "0" + month : month) + "." + year;
    }

}
