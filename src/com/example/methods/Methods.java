package com.example.methods;

public class Methods {

    public static void main(String[] args) {
        // a void method is one that simply performs a task and then terminates

        // System.out.println("This is a void method!");

        // a value-returning method not only performs a task,
        // but also sends a value back to the code that called it

        // int num = Integer.parseInt("700");
        printAverage(20, 30);

        double average = getAverage(20, 30);
        System.out.println("Average: " + average);

        System.out.println(fullName("john","doe"));

        System.out.println("the status of 5: " + isValid(5));
        System.out.println("the status of 1000: " + isValid(1000));
    }

    /**
     * This method prints the average of two numbers
     * @param val1
     * @param val2
     */
    public static void printAverage(int val1, int val2){
        double average = (val1 + val2) / 2.0;
        System.out.println("Average: " + average);
    }

    /**
     * calculates the average of two numbers
     * @param val1
     * @param val2
     * @return double average
     */
    public static double getAverage(int val1, int val2){
        return (val1 + val2) / 2.0;
    }

    /**
     * combines full name
     * @param name
     * @param surname
     * @return the combined first and last name
     */
    public static String fullName(String name, String surname){
        return name + " " + surname;
    }

    // range between 1 and 100
    public static boolean isValid(int num){
        return (num >= 1 && num <= 100);
    }

}
