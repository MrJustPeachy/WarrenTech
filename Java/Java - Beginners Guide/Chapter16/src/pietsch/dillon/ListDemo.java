package pietsch.dillon;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * PROGRAM NAME: ListDemo.java
 * PROGRAM PURPOSE: Demonstrates JList
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: 6/27/2017
 */
public class ListDemo implements ListSelectionListener{

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    String names[] = {
            "Sherry", "Jon", "Rachel",
            "Sasha", "Jocelyn", "Randy",
            "Tom", "Mary", "Ken",
            "Andrew", "Matt", "Todd" };

    ListDemo(){

        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlst = new JList<String>(names);
//        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jlab = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le){



        int[] selectedIndices = jlst.getSelectedIndices();

        if(selectedIndices.length != 0){
            String str = "";
            for(int i : selectedIndices)
                str += names[i] + " ";

            jlab.setText("Names selected: " + str);
        }
        else
            jlab.setText("Select a name");
    }

    public static void main(String args[]){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });

    }



}
