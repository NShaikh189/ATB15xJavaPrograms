package Exam_18_Jan_Programs;

import java.util.Scanner;

/*
2️⃣ Program Name: Check String Length

Description:
Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
 */
public class P2_CheckStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String result = (str.length()>10) ? "Length greater than 10" : "Length Not greater than 10";

        System.out.println(result);
    }
}
