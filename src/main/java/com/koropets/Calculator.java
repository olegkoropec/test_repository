package com.koropets;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class Calculator {

    public static void main(String[] args) {
        JPanel windowContent = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JTextField displayField = new JTextField(20);



//        JButton button0 = new JButton("0");
//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");
//        JButton button5 = new JButton("5");
//        JButton button6 = new JButton("6");
//        JButton button7 = new JButton("7");
//        JButton button8 = new JButton("8");
//        JButton button9 = new JButton("9");
        JButton buttonPoint  = new JButton(".");
        JButton buttonEqual = new JButton("=");
        JButton buttonPlus = new JButton ("+");
        JButton buttonMinus = new JButton ("-");
        JButton buttonMultiplay = new JButton ("*");
        JButton buttonDivision = new JButton ("/");

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        GridLayout gl =new GridLayout(4,3);
        p1.setLayout(gl);

        for (int i=0; i<10; i++)
            p1.add(button[i]);

//        p1.add(button1);
//        p1.add(button2);
//        p1.add(button3);
//        p1.add(button4);
//        p1.add(button5);
//        p1.add(button6);
//        p1.add(button7);
//        p1.add(button8);
//        p1.add(button9);
//        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        GridLayout glt = new GridLayout (4,1);
        p2.setLayout(glt);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiplay);
        p2.add(buttonDivision);

        windowContent.add("Center",p1);
        windowContent.add("East",p2);
        windowContent.add("North",displayField);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);

    }

}