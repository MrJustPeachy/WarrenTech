package pietsch.dillon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 * PROGRAM NAME: SwingFC.java
 * PROGRAM PURPOSE: Uses a swing GUI to compare two files
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class SwingFC implements ActionListener{

    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;

    JLabel jlabFirst, jlabSecond;
    JLabel jlabResult;

    JCheckBox jcb;

    SwingFC(){

        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 190);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        JButton jbtnComp = new JButton("Compare");
        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        jcb = new JCheckBox("Points to the position of mismatch");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);
        jfrm.add(jcb);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        int i = 0, j = 0, c = 0;

        if(jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if(jtfSecond.getText().equals("")){
            jlabResult.setText("Second file name missing.");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())){

            do {
                i = f1.read();
                j = f2.read();
                c++; // hehe
                if(i != j) break;
            } while(i != -1 && j != -1);

            if(i != j)
                if(!jcb.isSelected())
                    jlabResult.setText("Files are not the same.");
                else
                    jlabResult.setText("Mismatch is at " + c);
            else
                jlabResult.setText("Files compare equal");
        } catch(IOException exc){
            jlabResult.setText("File Error");
        }
    }

    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingFC();
            }
        });
    }

}
