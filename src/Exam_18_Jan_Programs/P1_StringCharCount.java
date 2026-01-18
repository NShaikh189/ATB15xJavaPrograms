package Exam_18_Jan_Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1️⃣ Program Name: Count Characters in a String

Description:
Write a Java program to count the total number of characters in a given string (excluding spaces).
 */
public class P1_StringCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scanner.nextLine();
       int charCount = countChars(str);
        System.out.println("Count of Characters excluding spaces : "+charCount);

    }

    private static int countChars(String str) {
        int charCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
                charCount++;
        }
        return charCount;
    }
}
