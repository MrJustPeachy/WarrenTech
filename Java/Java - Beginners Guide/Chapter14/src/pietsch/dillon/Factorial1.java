package pietsch.dillon;

/**
 * PROGRAM NAME: Factorial1.java
 * PROGRAM PURPOSE: Lambda that finds int factorial
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/26/2017
 */

public class Factorial1 {

    public static void main(String args[]){

        NumericFunc factorial = (n) ->  {
            int result = 1;
            for(int i=1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("3! is " + factorial.func(3));
        System.out.println("5! is " + factorial.func(5));
        System.out.println("9! is " + factorial.func(9));


    }

}
