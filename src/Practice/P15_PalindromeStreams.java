package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P15_PalindromeStreams {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string to check if it is a Palindrome");
        String str = scanner.nextLine();
        String str1 = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        boolean isPalindrome = IntStream.range(0, str1.length() / 2).allMatch(i -> str1.charAt(i) == str1.charAt(str1.length() - 1 - i));

        if(isPalindrome)
            System.out.println("Is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
