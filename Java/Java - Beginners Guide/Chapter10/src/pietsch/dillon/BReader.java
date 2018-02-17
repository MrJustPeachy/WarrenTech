package pietsch.dillon;



/**
 * PROGRAM NAME: BReader.java
 * PROGRAM PURPOSE: Use BufferedReader to read characters from the console
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/14/2017
 */
// Use a BufferedReader to read characters from the console.
import java.io.*;

class BReader{
    public static void br() throws IOException{
        char c;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, enter a period to quit");

        // read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while(c != '.');
    }
}

