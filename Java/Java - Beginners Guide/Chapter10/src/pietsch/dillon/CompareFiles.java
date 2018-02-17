package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: CompareFiles.java
 * PROGRAM PURPOSE: Compares two files
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/10/2017
 */
public class CompareFiles {

    public static void compare(){
        int i = 0, j = 0;

        try (FileInputStream f1 = new FileInputStream("test.txt");
             FileInputStream f2 = new FileInputStream("test2.txt"))
        {
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            } while(i != -1 && j != -1);

            if(i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }

}
