package pietsch.dillon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * PROGRAM NAME: ButtonDemo.java
 * PROGRAM PURPOSE: Create a button with swing
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class ButtonDemo implements ActionListener{

    JLabel jlab;

    ButtonDemo(){

        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Button Example");

        // Speicfy FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(220, 90);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        // Add action listeners
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        // Add the buttons to the content pane
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        // Create a label
        jlab = new JLabel("Press a button.");

        // Add the label to the frame
        jfrm.add(jlab);

        // Display the frame
        jfrm.setVisible(true);
    }

    // Handles button events
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up.");
        else
            jlab.setText("You pressed down.");
    }


    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });

    }

}
