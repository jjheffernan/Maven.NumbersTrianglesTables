package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class TableUtilities {
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

    public static String getMultiplicationTable(int tableSize) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your multiplication integer for the table");
        int num = sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        return null;

    }
}
