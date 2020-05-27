package com.example.readoptionjpane;


import javax.swing.*;

public class ReadJOptionPane {

    /**
     * This is the main method of the class
     * @param args just a variable
     */

    public static void main(String[] args) {

        String name;
        String surname;

        name = JOptionPane.showInputDialog("Please enter your name: ");

        surname = JOptionPane.showInputDialog("please enter your surname: ");

        JOptionPane.showMessageDialog(null, name + " " + surname);

        int fn;
        int sn;
        String input;

        input = JOptionPane.showInputDialog("Please enter first number: ");
        fn = Integer.parseInt(input);
        sn = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second number"));

        double average = (fn + sn) / 2.0;

        JOptionPane.showMessageDialog(null, "Average: " + average);


    }
}
