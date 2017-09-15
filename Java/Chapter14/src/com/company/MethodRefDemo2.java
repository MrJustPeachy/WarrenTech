package com.company;

/**
 * PROGRAM NAME: MethodRefDemo2.java
 * PROGRAM PURPOSE: Demonstrates method references to instance methods
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: {6/25/2017}
 */

class MyIntNum {

    private int v;

    MyIntNum(int x) { v = x; }

    int getNum() { return v; }

    boolean isFactor(int n){
        return (v % n) == 0;
    }

}

public class MethodRefDemo2 {

    public static void main(String args[]){
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;

        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());

        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }

}
