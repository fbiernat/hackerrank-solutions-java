package com.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;

public class Password {

    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"Ab1"));
        System.out.println(minimumNumber(11,"#HackerRank"));

    }

    enum CHAR_TYPE {
        NUMBER, LOWER_CASE, UPPER_CASE, SPECIAL
    }

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int charactersToAdd = 0;
        Map<CHAR_TYPE, Boolean> containsMap = new HashMap<>();

        for (char c : password.toCharArray()) {
            CHAR_TYPE charType;
            if (!containsMap.containsKey(CHAR_TYPE.NUMBER) && numbers.contains(String.valueOf(c))) {
                charType = CHAR_TYPE.NUMBER;
                if (!containsMap.containsKey(charType)) {
                    containsMap.put(CHAR_TYPE.NUMBER, true);
                }
            }
            if (!containsMap.containsKey(CHAR_TYPE.LOWER_CASE) && lower_case.contains(String.valueOf(c))) {
                charType = CHAR_TYPE.LOWER_CASE;
                if (!containsMap.containsKey(charType)) {
                    containsMap.put(CHAR_TYPE.LOWER_CASE, true);
                }
            }
            if (!containsMap.containsKey(CHAR_TYPE.UPPER_CASE) && upper_case.contains(String.valueOf(c))) {
                charType = CHAR_TYPE.UPPER_CASE;
                if (!containsMap.containsKey(charType)) {
                    containsMap.put(CHAR_TYPE.UPPER_CASE, true);
                }
            }
            if (!containsMap.containsKey(CHAR_TYPE.SPECIAL) && special_characters.contains(String.valueOf(c))) {
                charType = CHAR_TYPE.SPECIAL;
                if (!containsMap.containsKey(charType)) {
                    containsMap.put(CHAR_TYPE.SPECIAL, true);
                }
            }
        }

        int missingConditions = 4 - containsMap.size();

        if (password.length() < 6) {
            charactersToAdd = 6 - password.length();
            if (charactersToAdd < missingConditions) {
                return missingConditions;
            }
        } else {
            charactersToAdd = missingConditions;
        }

        return charactersToAdd;
    }


}
