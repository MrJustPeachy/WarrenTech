package pietsch.dillon;
import java.util.function.Predicate;
/**
 * PROGRAM NAME: UsePredicateInterface.java
 * PROGRAM PURPOSE: Demonstrates the Predicate built-in functional interface
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/26/2017
 */
public class UsePredicateInterface {

    public static void main(String args[]){

        Predicate<Integer> isEven = (n) -> (n % 2) == 0;

        if(isEven.test(4)) System.out.println("4 is even");

        if(!isEven.test(5)) System.out.println("5 is odd");

    }

}
