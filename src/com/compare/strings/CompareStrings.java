package com.compare.strings;

import javax.swing.*;

public class CompareStrings {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please enter name1");
        String name2 = JOptionPane.showInputDialog("Please enter name2");

        if (name1.compareTo(name2)==0){
            System.out.println("equal");
        }
        else if(name1.compareTo(name2)< 0){
            System.out.println("name1 is first and name2 is second");
        }

        else if(name1.compareTo(name2) > 0){
            System.out.println("name2 is first and name1 is second");
        }

        System.exit(0);
    }
}
