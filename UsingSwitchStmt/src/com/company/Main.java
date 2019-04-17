package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int monthDays = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of days in month: ");
        monthDays = keyboard.nextInt();


        String monthName = "";
        switch (monthDays) {
            //February has either 28/29 days
            case 28:
            case 29:
                monthName = "February";
                break;
            //Months which have 30 days
            case 30:  monthName = "September April June November";
                break;
            //Months which have 31 days
            case 31:
                monthName = "January March May July August October December";
                break;
             //Error as days of the m oth is invalid
             default:
                 monthName = String.format("No months have exactly %d days", monthDays);
                break;
        }
        System.out.println(monthName);
    }
}
