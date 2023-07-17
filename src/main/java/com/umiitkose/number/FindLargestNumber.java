package com.umiitkose.number;

public class FindLargestNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 1, 2, 3, 7, 4, 1, 5};

        int largestNumber = 0;
        for (int i = 1; i < numbers.length; i++) {
            largestNumber = numbers[0];
            if (numbers[i] > largestNumber) largestNumber = numbers[i];
        }

        System.out.println(largestNumber);

    }
}
