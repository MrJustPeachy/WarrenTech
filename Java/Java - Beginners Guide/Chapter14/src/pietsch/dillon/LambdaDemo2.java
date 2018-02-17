package pietsch.dillon;

/**
 * PROGRAM NAME: LambdaDemo2.java
 * PROGRAM PURPOSE: Showcases some more lambda expressions
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/25/2017
 */

interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo2 {

    public static void main(String[] args){

        // Find out if one number is a factor of another
        NumericTest isFactor = (n,d ) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");

        if(!isFactor.test(10, 3))
            System.out.println("3 isn't a factor of 10");

        System.out.println();

        // See if first argument is less than the second
        NumericTest lessThan = (n, m) -> (n < m);

        if(!lessThan.test(10, 2))
            System.out.println("10 isn't less than 2");

        if(lessThan.test(2, 10))
            System.out.println("2 is less than 10");

        System.out.println();

        // See if absolute value is
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if(absEqual.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equal");

        if(!absEqual.test(4, -5))
            System.out.println("Absolute values of 4 and -5 are not equal");


    }

}
