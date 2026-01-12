package Exam_11_Jan_Programs;

import java.util.Scanner;

/*
Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
 */
public class P6_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1-7");

        int num = scanner.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        scanner.close();
    }
}
