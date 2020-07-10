package com.hackerrank.warmup;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:45:54PM"));
    }

    static String timeConversion(String s) {
        String[] time = s.split(":");
        String pmAm = time[2].substring(2);
        time[2] = time[2].substring(0, 2);

        if (pmAm.equalsIgnoreCase("PM") && !time[0].equals("12")) {
            time[0] = String.valueOf(Integer.parseInt(time[0]) + 12);
        }
        if (time[0].equals("12") && pmAm.equalsIgnoreCase("AM")) {
            time[0] = "00";
        }

        return time[0] + ":" + time[1] + ":" + time[2];
    }
}
