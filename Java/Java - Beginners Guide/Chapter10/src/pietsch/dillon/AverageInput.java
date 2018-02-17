package pietsch.dillon;

import java.io.*;

/**
 * PROGRAM NAME: AverageInput.java
 * PROGRAM PURPOSE: Averages user's numeric input
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/17/2017
 */
public class AverageInput {

    public static void ai() throws Exception{

        // Create BR with System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers will you enter: ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch(NumberFormatException exc){
            System.out.println("Invalid Format");
            n = 0;
        }

        System.out.println("Enter " + n + " values.");
        for(int i = 0; i < n; i ++){
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch(NumberFormatException exc){
                System.out.println("Invalid format.");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is " + avg);
    }

}
