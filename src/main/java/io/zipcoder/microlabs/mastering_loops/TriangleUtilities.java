package io.zipcoder.microlabs.mastering_loops;
import java.lang.StringBuilder;

public class TriangleUtilities {

    // private static double h;
    // private static double b;
    // double area;

    public static String getTriangle(int numberOfRows) {
        StringBuilder str = new StringBuilder();
        str.append("");
        // loop to iterate for the given number of rows
        for (int i = 1; i <= numberOfRows; i++) {
            str.append(TriangleUtilities.getRow(i));
            str.append("\n");

        }
        return str.toString();
    }

    public static String getRow(int numberOfStars) {
        int i;
        StringBuilder str = new StringBuilder();

        // outer loop to handle number of rows
        //  numberOfStars in this case
        for(i=0; i<numberOfStars; i++)
        {
            str.append("*");
        }
        return str.toString();
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }

    // legacy code
    /*
    // loop to print the number of spaces before the star
    for (int j <= numberOfRows) {
        System.out.print(" ");
    }

    // loop to print the number of stars in each row
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    // for new line after printing each row
    System.out.println();

     */

    /*
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();

     */
}
