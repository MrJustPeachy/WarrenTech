package pietsch.dillon;

/**
 * PROGRAM NAME: LambdaDemo.java
 * PROGRAM PURPOSE: Demonstrates lambda expressions
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/25/2017
 */

interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LambdaDemo {

    public static void main(String args[]){

        MyValue myVal; // declare interface reference

        myVal = () -> 98.6;

        System.out.println("A constaant value: " + myVal.getValue());

        // Lambda w/ parameters
        MyParamValue myPval = (n) -> 1.0 / n;

        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 4 is " + myPval.getValue(8.0));

    }

}
