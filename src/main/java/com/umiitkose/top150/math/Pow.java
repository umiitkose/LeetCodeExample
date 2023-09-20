package com.umiitkose.top150.math;

public class Pow {
    double temp = 1;

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00, -2));
    }

    public double myPow(double x, int n) {


        if (n > 0) {
            temp *= x;
            return myPow(x, --n);
        } else if (n < 0) {
            temp /= x;
            return myPow(x, ++n);
        } else {
            return temp;
        }

    }
}

//https://leetcode.com/problems/powx-n/submissions/987200360/ En doğru çözüm harika ..

/*public double myPow(double x, int n) {
    if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;}

        */