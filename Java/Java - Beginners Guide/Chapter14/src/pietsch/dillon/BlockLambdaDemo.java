package pietsch.dillon;

/**
 * PROGRAM NAME: BlockLambdaDemo.java
 * PROGRAM PURPOSE: Demonstrates block lambda expressions
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/25/2017
 */

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {

    public static void main(String args[]){

        // Returns the smallest positive factor of a value
        NumericFunc smallestF = (n) -> {

            int result = 1;

            // Get abs value of n
            n = n < 0 ? -n : n;

            for(int i = 2; i <= n/i; i++)
                if((n % i) == 0){
                    result = i;
                    break;
                }

                return result;
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));

    }

}
