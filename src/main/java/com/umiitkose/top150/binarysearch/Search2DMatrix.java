package com.umiitkose.top150.binarysearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        boolean b = search2DMatrix.searchMatrix(new int[][]{{1, 1, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        System.out.println(b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int target) {
        int begin = 0;
        int last = arr.length - 1;
        while (last >= begin) {
            int mid = (begin + last) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return false;
    }

    /**
     * You are given an m x n integer matrix matrix with the following two properties:
     *
     * Each row is sorted in non-decreasing order.
     * The first integer of each row is greater than the last integer of the previous row.
     * Given an integer target, return true if target is in matrix or false otherwise.
     *
     * You must write a solution in O(log(m * n)) time complexity.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     * Example 2:
     *
     *
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
     * Output: false
     *
     *
     * Constraints:
     *
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 100
     * -104 <= matrix[i][j], target <= 104*/

}
