package pietsch.dillon;

import javax.swing.*;

/**
 * PROGRAM NAME: SwingDemo.java
 * PROGRAM PURPOSE: Simple Swing demo
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class SwingDemo {

    SwingDemo() {

        // Create JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jfrm.setSize(275, 100);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jlab = new JLabel("Swing defines the modern Java GUI.");

        // Add the label to the content pane
        jfrm.add(jlab);

        //Display the frame
        jfrm.setVisible(true);

    }

    public static void main(String main[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new SwingDemo();
            }
        });
    }

}
