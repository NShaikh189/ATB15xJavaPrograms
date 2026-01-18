package Exam_18_Jan_Programs;

import java.util.Scanner;

/*
Program Name: Compare Two Strings

Description:
Write a Java program to compare two strings and check whether they are equal or not.
*/
public class P4_StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 =  scanner.nextLine();

        System.out.println("Enter second String: ");
        String str2 = scanner.nextLine();

        if(str1.trim().equalsIgnoreCase(str2.trim()))
        {
            System.out.println("Strings are equal");

        }
        else
            System.out.println("String not equal ");

        }
}
