package pietsch.dillon;

/**
 * PROGRAM NAME: LambdaDemo3.java
 * PROGRAM PURPOSE: String comparison lamdas
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/25/2017
 */

interface StringTest {
    boolean test(String aStr, String bStr);
}

public class LambdaDemo3 {

    public static void main(String args[]){

        // Determines if one string is part of another
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "This is a test";

        System.out.println("testing string: " + str);

        if(isIn.test(str, "is a"))
            System.out.println("'is a' found");
        else
            System.out.println("'is a' not found");

        if(isIn.test(str, "xyz"))
            System.out.println("'xyz' found");
        else
            System.out.println("'xyz' not found");

    }

}
