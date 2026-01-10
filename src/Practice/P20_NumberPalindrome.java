package Practice;

import java.util.Scanner;

public class P20_NumberPalindrome {

    public static void checkPalindrome(int num)
    {
        //int originalNumber = num;
        int revNumber=P30_ReverseNumber.reverseNumber(num);
//                int temp;
//        while(num!=0)
//        {
//            temp = num%10;
//            revNumber = revNumber*10+temp;
//            num = num/10;
//        }
        if(num==revNumber)
        System.out.println("Number is a Palindrome");
        else
            System.out.println("Not a Palindrome0");
    }
    public static void main() {
        int x = 010;//8  parsed as a Octal number
        // 0 stands for Octal number - Octal(base 8): 1 * 8^1 + 0 * 8^0 = 8
        //compile time - Integer literal rule is applied
        System.out.println(x);
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); // 010 is parsed as Decimal
        //Runtime: Integer Parsing rule is applied Integer.parseInt("010")
        System.out.println(num); //
        checkPalindrome(num);
    }
}
