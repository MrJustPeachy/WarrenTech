package pietsch.dillon;

/**
 * PROGRAM NAME: GenericInterface.java
 * PROGRAM PURPOSE: Demonstrates a generic interface
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

interface Containment<T> {
    boolean contains(T o);
}

public class GenericInterface<T> implements Containment<T>{

    T[] arrayRef;

    GenericInterface(T[] o){
        arrayRef = o;
    }

    // Implement contains
    public boolean contains(T o){
        for(T x: arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}
