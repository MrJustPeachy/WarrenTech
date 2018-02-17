package pietsch.dillon;

/**
 * PROGRAM NAME: GenericConstructor.java
 * PROGRAM PURPOSE: Demonstrate a generic constructor
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class GenericConstructor {

    private int sum;

    <T extends Number> GenericConstructor(T arg){
        sum = 0;

        for(int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum(){
        return sum;
    }

}
