package pietsch.dillon;

import java.util.Comparator;

/**
 * PROGRAM NAME: GenericMethods.java
 * PROGRAM PURPOSE: Use a simple generic method
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class GenericMethods {

    // Determines if the contents of two arrays are the same.
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y){
        if(x.length != y.length) return false;

        for(int i = 0; i < x.length; i++)
            if(!x[i].equals(y[i])) return false;

        return true;
    }

}
