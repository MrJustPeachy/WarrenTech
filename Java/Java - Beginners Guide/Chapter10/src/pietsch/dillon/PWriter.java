package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: PWriter.java
 * PROGRAM PURPOSE: Write to console using character streams
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/14/2017
 */
public class PWriter {

    public static void pwr(){

        PrintWriter pw = new PrintWriter(System.out, true); // autoFlush == true
        int i = 10;
        double d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " is " + (i + d));
    }

}
