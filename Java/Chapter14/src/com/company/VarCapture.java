package com.company;

/**
 * PROGRAM NAME: VarCapture.java
 * PROGRAM PURPOSE:
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: {6/25/2017}
 */

interface MyFunc {
    int func(int n);
}

public class VarCapture {

    public static void main(String args[]){

        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

            return v;
        };

        System.out.println(myLambda.func(8));

    }

}
