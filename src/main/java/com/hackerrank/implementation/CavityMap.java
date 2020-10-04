package com.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/cavity-map/problem
 * <p>
 * You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth. We
 * will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell
 * adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side, or edge.
 * <p>
 * Find all the cavities on the map and replace their depths with the uppercase character X.
 * <p>
 * For example, given a matrix:
 * <p>
 * 989
 * 191
 * 111
 * You should return:
 * <p>
 * 989
 * 1X1
 * 111
 * The center cell was deeper than those on its edges: [8,1,1,1]. The deep cells in the top two corners don't share
 * an edge with the center cell.
 */
public class CavityMap {

    /**
     * Complete the cavityMap function in the editor below. It should return an array of strings, each representing a
     * line of the completed map.
     * <p>
     * cavityMap has the following parameter(s):
     *
     * @param grid an array of strings, each representing a row of the grid
     * @return an array of strings, each representing a line of the completed map.
     */
    static String[] cavityMap(String[] grid) {
        List<Integer[]> cavitiesCoordinates = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[i].length() - 1) {
                    // cell is on the edge of the map
                    continue;
                }
                int cellValue = getCellValue(grid, i, j);
                // check if cell is a cavity
                if (getCellValue(grid, i - 1, j) < cellValue &&
                        getCellValue(grid, i, j - 1) < cellValue &&
                        getCellValue(grid, i, j + 1) < cellValue &&
                        getCellValue(grid, i + 1, j) < cellValue) {
                    // cell is a cavity, save coordinates to list
                    cavitiesCoordinates.add(new Integer[]{i, j});
                }
            }
        }

        // substitute cavities coordinates with "X" symbol
        for (Integer[] coords : cavitiesCoordinates) {
            int x = coords[0];
            int y = coords[1];
            String[] row = grid[x].split("");
            row[y] = "X";
            grid[x] = String.join("", row);
        }

        return grid;
    }

    private static int getCellValue(String[] grid, int i, int j) {
        return Integer.parseInt(grid[i].substring(j, j + 1));
    }

    private static void printCavityMap(String[] grid) {
        for (String s : grid) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printCavityMap(cavityMap(new String[]{"989", "191", "111"}));
        /* output:
         *  989
         *  1X1
         *  111
         */

        printCavityMap(cavityMap(new String[]{"1112", "1912", "1892", "1234"}));
        /*
         * output:
         * 1112
         * 1X12
         * 18X2
         * 1234
         */
    }

}
