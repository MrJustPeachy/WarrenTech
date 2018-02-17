package pietsch.dillon;

/**
 * PROGRAM NAME: GenericFunctionalInterfaceDemo.java
 * PROGRAM PURPOSE: Demonstrates generic functional interfaces
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/25/2017
 */

interface SomeTest<T> {
    boolean test(T n, T m);
}

public class GenericFunctionalInterfaceDemo {

    public static void main(String args[]){

        // Determines if one integer is a factor of another
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        System.out.println();

        // Determines if one Double is a factor of another
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if(isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor of 212.0");
        System.out.println();

        // Determines if one string is part of another
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "face"))
            System.out.println("'face' is found");
        else
            System.out.println("'face' not found");

    }

}
