package com.umiitkose.top150.bitmanipulation;

import java.math.BigInteger;

//https://leetcode.com/problems/add-binary/?envType=study-plan-v2&envId=top-interview-150
public class AddBinary {

    public static void main(String[] args) {
        AddBinary binary = new AddBinary();
        System.out.println(binary.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        BigInteger c = new BigInteger(a, 2);
        BigInteger d = new BigInteger(b, 2);
        BigInteger p = c.add(d);
        return p.toString(2);

    }
}
