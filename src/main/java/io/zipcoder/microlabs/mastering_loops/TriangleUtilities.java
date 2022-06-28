package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;

public class TriangleUtilities {

    // private static double h;
    // private static double b;
    // double area;

    public static String getTriangle(int numberOfRows) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed ");
        int rows = sc.nextInt();

        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // for new line after printing each row
            System.out.println();
        }
        return null;
    }

    public static String getRow(int numberOfStars) {
        int i, j;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars to be printed ");
        int n = sc.nextInt();

        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
        return null;
    }

    public static String getSmallTriangle() {

        return null;
    }

    public static String getLargeTriangle() {

        return null;
    }
}
