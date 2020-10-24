package com.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/lisa-workbook/problem
 * <p>
 * Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. Lisa believes a
 * problem to be special if its index (within a chapter) is the same as the page number where it's located. The
 * format of Lisa's book is as follows:
 * <p>
 * There are n chapters in Lisa's workbook, numbered from 1 to n.
 * The ith chapter has arr[i] problems, numbered from 1 to arr[i].
 * Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.
 * Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
 * The page number indexing starts at 1.
 * <p>
 * Given the details for Lisa's workbook, can you count its number of special problems?
 * <p>
 * For example, Lisa's workbook contains arr[1] = 4 problems for chapter 1, and arr[2] = 2 problems for chapter 2.
 * Each page can hold k = 3 problems. The first page will hold 3 problems for chapter 1. Problem 1 is on page 1, so
 * it is special. Page 2 contains only Chapter 1, Problem 4, so no special problem is on page 2. Chapter 2 problems
 * start on page 3 and there are 2 problems. Since there is no problem 3 on page 3, there is no special problem on
 * that page either. There is 1 special problem in her workbook.
 */
public class LisasWorkbook {

    /**
     * Complete the workbook function in the editor below. It should return an integer that represents the number of
     * special problems in the workbook.
     * <p>
     * workbook has the following parameter(s):
     *
     * @param n   an integer that denotes the number of chapters
     * @param k   an integer that denotes the maximum number of problems per page
     * @param arr an array of integers that denote the number of problems in each chapter
     * @return an integer that represents the number of special problems in the workbook
     */
    static int workbook(int n, int k, int[] arr) {
        int specialProblems = 0;

        List<Integer> problemsPerPage = new ArrayList<>();
        int chapter = 1, page = 1;
        for (int problemsPerChapter : arr) {
            for (int p = 1; p <= problemsPerChapter; p++) {
                problemsPerPage.add(p);
                if (p == page) {
                    System.out.println("Special problem detected, problem: " + p + ", chapter: " + chapter + ", page:" +
                            " " + page);
                    specialProblems++;
                }
                if (p % k == 0 || p == problemsPerChapter) {
                    System.out.println("Problems on page " + page + ": " + problemsPerPage);
                    page++;
                    problemsPerPage.clear();
                }
            }
            chapter++;
        }
        return specialProblems;
    }

    public static void main(String[] args) {
        System.out.println(workbook(5, 3, new int[]{4, 2, 6, 1, 10}));                          // 4
        System.out.println(workbook(10, 5, new int[]{3, 8, 15, 11, 14, 1, 9, 2, 24, 31}));      // 8
    }

}
