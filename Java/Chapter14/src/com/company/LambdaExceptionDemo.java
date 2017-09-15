package com.company;
import java.io.*;

/**
 * PROGRAM NAME: LambdaExceptionDemo.java
 * PROGRAM PURPOSE: Show how an exception is thrown from a lambda expression
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: {6/25/2017}
 */

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

public class LambdaExceptionDemo {

    public static void main(String args[]){

        double[] values = {1.0, 2.0, 3.0, 4.0};

        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            return true;
        };

    }

}
