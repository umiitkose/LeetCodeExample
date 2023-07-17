package com.umiitkose.array.easy.quiz1351;

public class CountNegativeNumber {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{-4, 3, 2, -1}, {3, 2, 1, -1}, {-1, 1, -1, -2}};
        CountNegativeNumber countNegativeNumber = new CountNegativeNumber();
        System.out.println(countNegativeNumber.countNegatives(grid));
    }

    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0)
                    count++;
            }
        }

        return count;
    }
}

/* Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.



Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
*/

/*
* Hızlı Çözüm için:
*
*  public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        //start position in the left bottom (but it can be right top)
        int i = rows - 1;
        int j = 0;

        int result = 0;
        while(i>=0 && j<columns) {
            if(grid[i][j]<0) {
                i--;                         //switch to the upper row
                result += columns - j;       //add to result count of all numbers from current ot the end of row (because of sorted row)
            } else {
                j++;                         //switch to the right column
            }
        }

        return result;
    }
* */