package com.hackerrank.implementation;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 * <p>
 * In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter
 * heights given, determine the area of the rectangle highlight in mm^2 assuming all letters are 1mm wide.
 * <p>
 * For example, the highlighted word = torn. Assume the heights of the letters are t = 2, o = 1, r = 1 and n = 1. The
 * tallest letter is 2 high and there
 * are 4 letters. The highlighted area will be 2 * 4 = 8mm^2 so the answer is 8.
 */
public class DesignerPDFViewer {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Complete the designerPdfViewer function in the editor below. It should return an integer representing the size
     * of the highlighted area.
     * <p>
     * designerPdfViewer has the following parameter(s):
     *
     * @param h    an array of integers representing the heights of each letter
     * @param word a string
     * @return an integer representing the size of the highlighted area
     */
    static int designerPdfViewer(int[] h, String word) {
        // find highest letter
        int max = Integer.MIN_VALUE;
        for (String l : word.split("")) {
            int height = h[ALPHABET.indexOf(l)];
            if (height > max) {
                max = height;
            }
        }
        // return size of the highlighted area
        return max * word.length();
    }

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5}, "abc")); // output: 9

        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 7}, "zaba")); // output: 28
    }
}
