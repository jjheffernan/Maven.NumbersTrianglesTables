package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.Math;

public class NumberUtilities {
    // StringBuilder str = new StringBuilder();

    int start = getIntegerInput("enter starting number");
    int stop = getIntegerInput("enter stop number");


    public static String getEvenNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        int i = start;
        int num = stop;
        //the while loop executes until the condition become false
        if(i%2==0) {
            System.out.println(i);

            while (i <= num) {
                //prints the even number
                str.append(i);
                //increments the variable i by 2
                i = i + 2;
            }
        } else {
            return null;
        }
        return str.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        System.out.print("List of odd numbers: ");
        StringBuilder str = new StringBuilder();
        int i = start;
        int num = stop;
        //the while loop executes until the condition become false
        if(i%2!=0) {
            System.out.println(i);

            while (i <= num) {
                //prints the even number
                str.append(i);
                //increments the variable i by 2
                i = i + 2;
            }
        } else {
            return null;
        }
        return str.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        
        return null;
    }
    // commented out single args to limit overflow chance
    // instead using null and default step values
    public static String getRange(int start) {
        StringBuilder str = new StringBuilder();

        /*for (int i = 1; i < start; i++) {
            str.append(i);
        }
        */

        // return str.toString();
        return NumberUtilities.getRange(0, start, 1);
    }



    public static String getRange(int start, int stop) {
        StringBuilder str = new StringBuilder();
        System.out.print("range of numbers: ");
        int i = start;
        int num = stop;
        for (i = start; i < stop; i++) {
            str.append(i);
        }
        return str.toString();
    }


     //

    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        System.out.print("range of numbers: ");
        int j = step;
        int i = start;
        int num = stop;
        for (i = start; i < stop; i += step) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {


        return null;
    }

    public int getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = String.valueOf(scanner.nextInt());
        return Integer.parseInt(userInput);
    }
}
