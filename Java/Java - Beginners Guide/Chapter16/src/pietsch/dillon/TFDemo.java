package pietsch.dillon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * PROGRAM NAME: TFDemo.java
 * PROGRAM PURPOSE: Swing text fields in action
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class TFDemo implements ActionListener{

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo(){

        // Create a new JFrame container
        JFrame jfrm = new JFrame("Use a text field");

        // Speicfy FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(240, 120);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new text field
        jtf = new JTextField(10); // 10 columns wide

        // Set the action commands for the text field
        jtf.setActionCommand("myTF");

        // Create the Reverse button
        JButton jbtnRev = new JButton("Reverse");

        // Add action listeners
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // Create the labels
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Add the components to the content pane
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Display frame
        jfrm.setVisible(true);
    }

    // Handle action events
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("Reverse")){

            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse the string
            for(int i = orgStr.length() - 1; i >= 0; i--)
                resStr += orgStr.charAt(i);

            jtf.setText(resStr);
        } else
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());

    }

    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TFDemo();
            }
        });
    }

}
