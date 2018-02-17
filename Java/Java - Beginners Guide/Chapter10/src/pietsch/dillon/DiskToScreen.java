package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: DiskToScreen.java
 * PROGRAM PURPOSE: Uses file reader to create a disk to screen utility.
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/17/2017
 */
public class DiskToScreen {

    public static void dts(){

        String s;

        // Create FileReader with BufferedReader in-between
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            while((s = br.readLine()) != null);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }

    }

}
