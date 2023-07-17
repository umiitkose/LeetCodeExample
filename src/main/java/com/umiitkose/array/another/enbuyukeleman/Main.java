package com.umiitkose.array.another.enbuyukeleman;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strings = new String[]{"asdasd", "svadasd", "bashdnvbsdfa"};
        Main main = new Main();
        int mostLengthArray = main.findMostLengthArray(strings);
        System.out.println(mostLengthArray);
    }

    private int findMostLengthArray(String[] strings) {
        return Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
    }
}
