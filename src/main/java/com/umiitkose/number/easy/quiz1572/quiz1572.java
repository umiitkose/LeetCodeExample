package com.umiitkose.number.easy.quiz1572;

public class quiz1572 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        quiz1572 quiz1572 = new quiz1572();

        System.out.println(quiz1572.diagonalSum(a));
    }

    public int diagonalSum(int[][] mat) {
        int toplam = 0;
        int j = mat.length - 1;
        for (int i = 0; i < mat.length; i++) { //0 1 2
            if (i != j)
                toplam = toplam + mat[j][i];
            j--;

        }

        for (int i = mat.length - 1; i >= 0; i--) {
            toplam = toplam + mat[i][i];
        }
        return toplam;
    }
}
