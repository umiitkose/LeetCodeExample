package com.umiitkose.top150.arrayandstring;

//https://leetcode.com/problems/rotate-image/solutions/18879/ac-java-in-place-solution-with-explanation-easy-to-understand/?envType=study-plan-v2&envId=top-interview-150

//https://www.baeldung.com/java-in-place-sorting
public class RotateImage {
    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}});
    }

    //In Place Çözüm..
    public class Solution {
        public void rotate(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
                }
            }
        }
    }

    public void rotate(int[][] matrix) {
        int begin = 0;
        int last = 0;
        int lenght = matrix.length;

        int[][] newArr = new int[lenght][lenght];

        for (int i = lenght - 1; i >= 0; i--) {
            for (int j = 0; j < lenght; j++) {
                newArr[begin][last] = matrix[i][j];
                begin++;

            }
            begin = 0;
            last++;
        }
        matrix = newArr;
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     *
     * Another Solution - True Solution
     *  public void transpose(int[][] matrix){
     *         for(int i = 0; i < matrix.length; i++){
     *             for(int j = i; j < matrix[0].length; j++){
     *                 int temp = matrix[i][j];
     *                 matrix[i][j] = matrix[j][i];
     *                 matrix[j][i] = temp;
     *             }
     *         }
     *     }
     *
     *     public void reverse(int[] arr){
     *         int i = 0, j = arr.length-1;
     *         while(i <= j){
     *             int temp = arr[i];
     *             arr[i] = arr[j];
     *             arr[j] = temp;
     *             i++;
     *             j--;
     *         }
     *     }
     *
     *     public void rotate(int[][] matrix) {
     *         transpose(matrix);
     *         for(int[] arr : matrix)
     *             reverse(arr);
     *     }
     * */
}
