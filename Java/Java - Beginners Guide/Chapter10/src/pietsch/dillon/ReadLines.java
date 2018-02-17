package pietsch.dillon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PROGRAM NAME: ReadLines.java
 * PROGRAM PURPOSE: Get a whole line from the Buffered Reader
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/14/2017
 */
public class ReadLines {

    public static void rl() throws IOException {

        //Create BR using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter stop to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }

}
