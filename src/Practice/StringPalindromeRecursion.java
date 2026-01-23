package Practice;

import java.util.Scanner;
//madam
//adam
//dam
public class StringPalindromeRecursion {

    static String reverseString(String str)
    {
        if(str.length()==1)
            return str;

        return reverseString(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str   = scanner.next();
        String revStr = reverseString(str);
        System.out.println(revStr);

        if(str.equals(revStr))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
