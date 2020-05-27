package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws IOException {

        // creates the file and opens it
        // if the file exists, replace that file
        PrintWriter outputfile = new PrintWriter("OutputFile.txt");

        outputfile.println("This is line 1");
        outputfile.println("This is line 2");
        outputfile.println("This is line 3");

        outputfile.println("This is line 4");

        outputfile.close();

    }
}
