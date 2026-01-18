package Exam_18_Jan_Programs;

import java.util.Scanner;

/*
Program Name: Convert String to Uppercase

Description:
Write a Java program to convert a given string into uppercase and print the result.
 */
public class P3_StringUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =  scanner.nextLine();

        StringBuffer sb = new StringBuffer();
        if(!str.trim().isEmpty())
        {
            sb.append(str.toUpperCase());
            System.out.println(sb.toString());

        }
        else
            System.out.println("Invalid String ");

        }
}
