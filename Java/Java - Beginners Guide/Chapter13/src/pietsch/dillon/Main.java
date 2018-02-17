package pietsch.dillon;

import java.util.DoubleSummaryStatistics;

/**
 * PROGRAM NAME: Main.java
 * PROGRAM PURPOSE: Central file for running all of the programs
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

/*

        Generics are fundamentally parameterized types
            - Enable types to be parameters for classes, interfaces and methods.

 */
public class Main {

    public static void main(String[] args) {

        // Gen.java

        // T references Integers
        Gen<Integer> iOb;
        // Autobox int into iOb
        iOb = new Gen<Integer>(88);
        // Show iOb data type
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value: " + v);
        System.out.println();
        // T references Strings
        Gen<String> strOb = new Gen<String>("Generics Test");
        // Show strOb type
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value: " + str);

        System.out.println();

        // TwoGen.java
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();
        int i = tgObj.getob1();
        System.out.println("value: " + i);
        String s = tgObj.getob2();
        System.out.println("value: " + s);

        System.out.println();

        // NumericFns.java
        NumericFns<Integer> nfOb = new NumericFns<>(5);
        System.out.println("Reciprocal of nfOb is " + nfOb.reciprocal());
        System.out.println();
        NumericFns<Double> dOb = new NumericFns<>(5.25);
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fraction of dOb is " + dOb.fraction());

        System.out.println();

        // Testing Wildcard values
        NumericFns<Integer> w1 = new NumericFns<>(6);
        NumericFns<Double> w2 = new NumericFns<>(-6.0);
        NumericFns<Long> w3 = new NumericFns<>(5L);

        System.out.println("Comparing w1 and w2");
        if(w1.absEqual(w2))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Comparing w1 and w3");
        if(w1.absEqual(w3))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        //GenericMethods.java
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        if(GenericMethods.arraysEqual(nums, nums))
            System.out.println("nums equals nums");

        if(GenericMethods.arraysEqual(nums, nums2))
            System.out.println("nums equals nums2");

        if(GenericMethods.arraysEqual(nums, nums3))
            System.out.println("nums equals nums3");

        if(GenericMethods.arraysEqual(nums, nums4))
            System.out.println("nums equals nums4");

        System.out.println();

        // GenericConstructor.java
        GenericConstructor ob = new GenericConstructor(4.0);
        System.out.println("Summation of 4.0 is " + ob.getSum());

        System.out.println();

        // GenericInterface.java
        Integer x[] = {1, 2, 3};

        GenericInterface<Integer> gi = new GenericInterface<Integer>(x);

        if(gi.contains(2))
            System.out.println("2 is in ob");
        else
            System.out.println("2 is NOT in ob");

        if(gi.contains(5))
            System.out.println("5 is in ob");
        else
            System.out.println("5 is NOT in ob");

        System.out.println();

        // Try This 13-1
        GenQDemo.gqd();

        System.out.println();

        // Raw Type
        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getob();
        System.out.println("value: " + d);
    }
}