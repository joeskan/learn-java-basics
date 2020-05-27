package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {

    public static void main(String[] args) throws IOException {

        File file = new File("OutputFile.txt");
        double sum = 0;
        int count = 0;


        if (file.exists()){
            Scanner sc = new Scanner(file);
            while(sc.hasNext()) {
                // System.out.println(sc.nextLine());
                count++;
                sum += Double.parseDouble(sc.nextLine());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "The file does not exists!");
        }

        JOptionPane.showMessageDialog(null, "The Average is: " + (double) (sum/ count) + "\nThe count is: " + count + "\nThe sum of numbers is: " + sum);
    }
}
