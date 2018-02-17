package pietsch.dillon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * PROGRAM NAME: CBDemo.java
 * PROGRAM PURPOSE: Check Box Demo in Java
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class CBDemo implements ItemListener{

    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbCharlie;

    CBDemo(){

        // Create a new JFrame container
        JFrame jfrm = new JFrame("Demonstrate CHeck Boxes");

        // Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Initial size
        jfrm.setSize(280, 120);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbCharlie = new JCheckBox("Charlie");

        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbCharlie.addItemListener(this);

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbCharlie);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        jfrm.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){

        String str = "";

        JCheckBox cb = (JCheckBox) e.getItem();

        if(cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected.");
        else
            jlabChanged.setText(cb.getText() + " was just cleared.");

        if(jcbAlpha.isSelected())
            str += "Alpha ";

        if(jcbBeta.isSelected())
            str += "Beta ";

        if(jcbCharlie.isSelected())
            str += "Charlie ";

        jlabSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }

}
