/*
PROGRAM NAME: Main.java
PROGRAM PURPOSE: Collection of I/O programs
PROGRAMMER: Dillon Pietsch
DATE WRITTEN: 6-10-17
 */

package pietsch.dillon;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

        // Read an array of bytes from the keyboard
        byte data[] = new byte[10];
        System.out.println("Enter some characters.");
        System.in.read(data);
        System.out.print("You entered: ");
        for(int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);

        // Demonstrates System.out.write()
        int b;
        b = 'X';
        System.out.write(b); // Not as convenient as System.out.println()
        System.out.write('\n');

        // When reading from a file with FileInputStream you will need to close the file to release the memory and
        // and other resources associated with the file.

        // Read from a text file
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("test.txt");
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // read bytes until end of file is reached
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1); // When i == -1 then the entire has been read
        } catch(IOException esc) {
            System.out.println("Error reading file.");
        } finally {
            // Close the file out of the try block.
            try {
                fin.close();
            } catch (IOException exc){
                System.out.println("Error Closing File");
            }
        }

        /*
        This methodology works but is implemented better above
        try {
            fin.close();
        } catch (IOException exc){
            System.out.println("Error closing file.");
        }
        */

        System.out.println();

        // Uses a single try-catch-finally block for all the code above
        try {
            fin = new FileInputStream("test2.txt");

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException exc){
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // Close file regardless of the outcome
            try {
                if(fin != null) fin.close();
            } catch(IOException exc){
                System.out.println("Error Closing File");
            }
        }

        // Creating and writing a text file (copies test.txt to test3.txt)
        try {
            fin = new FileInputStream("test.txt");
            fout = new FileOutputStream("test3.txt");
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch (IOException exc){
                System.out.println("Error Closing Output File");
            }
        }

        System.out.println();

        // JDK 7+ now has automatic resource management which will automatically close the file when it's done being used

        // Open and read file without explicit close method
        try(FileInputStream f = new FileInputStream("test.txt")){
            do {
                i = f.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }

        // Open and copy a file with automatic resource management
        try (FileInputStream f = new FileInputStream("test.txt");
             FileOutputStream fo = new FileOutputStream("test4.txt")){
            do {
                i = f.read();
                if(i != -1) fo.write(i);
            } while(i != -1);
        } catch(IOException exc){
            System.out.println("I/O Error: " + exc);
        }

        System.out.println();

        RWData.binary();

        System.out.println();

        CompareFiles.compare();

        System.out.println();

        // Files can be accessed in a non-linear random order.
        RandomAccess.ra();

        // BufferedReader/Writer are better for char streams
        BReader.br();

        // BufferedReader for whole lines
        ReadLines.rl();

        // PrintWriter for console output w/ char streams
        PWriter.pwr();

        // File Writer with char streams
        KeyToDisk.ktd();

        // File Reader
        DiskToScreen.dts();

        // Average user input
        AverageInput.ai();


    }
}
