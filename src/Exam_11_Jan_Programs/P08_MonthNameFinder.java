package Exam_11_Jan_Programs;
/*
Write a Java program to print the month name based on the month number (1–12) using a switch statement.
 */

import java.util.Scanner;

public class P08_MonthNameFinder {

    static String findMonth(int num)
    {
        String month="";
        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month =  "February";
                break;
            case 3:
                month =  "March";
                break;
            case 4:
                month =  "April";
                break;
            case 5:
                month =  "May";
                break;
            case 6:
                month =  "June";
                break;
            case 7:
                month =  "July";
                break;
            case 8:
                month =  "August";
                break;
            case 9:
                month =  "September";
                break;
            case 10:
                month =  "October";
                break;
            case 11:
                month =  "November";
                break;
            case 12:
                month =  "December";

        }
        return month;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1-12 to find the name of Month");

        int num = scanner.nextInt();
        if(num>=1 && num<=12) {
            String monthName = findMonth(num);
            System.out.println(monthName);
        }
        else
            System.out.println("Invalid number");
        scanner.close();
    }
}
