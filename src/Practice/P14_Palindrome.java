package Practice;

import java.util.Scanner;

/*
✅ Palindrome Checker:
Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
Use an if-else statement to determine if the string is a palindrome.

 */
public class P14_Palindrome {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it is a Palindrome");
        String str = scanner.nextLine();
        String str1 = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
       //StringBuilder strb = new StringBuilder(str.replaceAll("[^A-Za-z0-9]",""));
       //String str2 = String.valueOf(strb.reverse());
       String str2 = new StringBuilder(str1).reverse().toString();
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Is Palindrome");
        else
            System.out.println("Is Not a Palindrome");

        scanner.close();
    }
}
