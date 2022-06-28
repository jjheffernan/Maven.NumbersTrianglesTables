package io.zipcoder.microlabs.mastering_loops;
import java.lang.StringBuilder;


public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        return(getMultiplicationTable(5));
    }

    public static String getLargeMultiplicationTable() {
        return(getMultiplicationTable(10));
    }
/*
   Expected Test Case
                "  1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |\n" +
                "  7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |\n" +
                "  8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |\n" +
                "  9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |\n" +
                " 10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |\n";
 */
    public static String getMultiplicationTable(int tableSize) {

        StringBuilder str = new StringBuilder();
        for(int i = 1; i <= tableSize; i++)
        {
            for (int j = 1; j <=tableSize; j++) {
                str.append(String.format("%3d |", i * j)); // has to be 3 digits to pass test
            }
            str.append("\n");
        }
        return str.toString();

    }
    /* legacy code
    import java.util.Scanner;

    public static String getSmallMultiplicationTable() {

        int num = 1;
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        return null;
    }

    public static String getLargeMultiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your multiplication integer for the table");
        int num = sc.nextInt();
        System.out.println("Enter your multiplication length for the table");
        int i = sc.nextInt();
        while(i <= 12)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
        return null;
    }
    */
}
