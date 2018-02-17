package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: KeyToDisk.java
 * PROGRAM PURPOSE: File I/O with char streams
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/14/2017
 */
public class KeyToDisk {

    public static void ktd(){

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");

        try (FileWriter fw = new FileWriter("testW.txt")){
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // add newline
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }

    }

}
