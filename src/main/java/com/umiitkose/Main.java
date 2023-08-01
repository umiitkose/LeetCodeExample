package com.umiitkose;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 4, 2, 4};
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
            System.out.println(xorr);
        }

    }
}
