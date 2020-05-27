package com.example.switchstatement;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;

public class TheSwitchStatement {
    public static void main(String[] args) {
        int num;

        String input = JOptionPane.showInputDialog("Please enter 1, 2, or 3: ");

        num = Integer.parseInt(input);

        switch (num){
            case 1:
                JOptionPane.showMessageDialog(null, "You entered 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "You entered 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "You entered 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "You did not enter 1, 2, or 3");
                break;
        }

        char letter;

        input = JOptionPane.showInputDialog("Please enter a, b, or c");
        letter = input.charAt(0);

        switch (letter){

            case 'a':
                JOptionPane.showMessageDialog(null, "you entered a");
                break;
            case 'b':
                JOptionPane.showMessageDialog(null, "you entered b");
                break;
            case 'c':
                JOptionPane.showMessageDialog(null, "you entered c");
                break;
            default:
                JOptionPane.showMessageDialog(null, "you didn't enter a, b, or c");
                break;
        }

        System.exit(0);
    }
}
