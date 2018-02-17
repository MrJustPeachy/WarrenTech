package pietsch.dillon;

/**
 * PROGRAM NAME: Gen.java
 * PROGRAM PURPOSE: Showcase a simple generic class
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */

// T is a type parameter which is placeholding for the real type that exists when object is created
public class Gen<T> {

    T ob; // declara an object of type T

    // Pass the constructor an object w/ Type T
    Gen(T o){
        ob = o;
    }

    // Return ob.
    T getob(){
        return ob;
    }

    // Show type of T
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }

}
