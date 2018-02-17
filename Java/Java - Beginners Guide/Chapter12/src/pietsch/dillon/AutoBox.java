package pietsch.dillon;

/**
 * PROGRAM NAME: AutoBox.java
 * PROGRAM PURPOSE: Demonstrates autoboxing/unboxing
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class AutoBox {

    public static void ab(){
        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i + " " + iOb); // displays 100 100
    }

}
