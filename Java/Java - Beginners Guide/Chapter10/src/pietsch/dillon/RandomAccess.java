package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: RandomAccess.java
 * PROGRAM PURPOSE: Read files in a random fashion
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/10/2017
 */
public class RandomAccess {

    public static void ra(){

        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")){
            // Write values to the file.
            for(int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }

            // Now, read back specific values
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // seek to second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3); // seek to fourth double
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Now, read every other value.
            System.out.println("Here are the other values: ");
            for(int i = 0; i < data.length; i += 2){
                raf.seek(8 * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}