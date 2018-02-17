package pietsch.dillon;

/**
 * PROGRAM NAME: AutoBox3.java
 * PROGRAM PURPOSE: Use auto(un)boxing is expression
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/24/2017
 */
public class AutoBox3 {

    public static void ab(){
        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original vlaue of iOb: " + iOb);

        // iOb is unboxed, incremented, and then boxed back in
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // iOb is unboxed, incremented, and then boxed back in
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        // iOb is unboxed, the operation is performed, and then boxed back into iOb2
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // Same expression except i isn't reboxed
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);

    }

}
