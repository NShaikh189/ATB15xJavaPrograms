package Exam_11_Jan_Programs;

import java.util.Scanner;

public class P11_ReverseNumberUsingDoWhileLoop {

    static int reverseNumber(int num)
    {
        int remainder;
        int reverseNumber=0;

        do{
            remainder = num%10;
            reverseNumber = reverseNumber*10+remainder;
            num = num/10;
        }while(num!=0);

        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println("Reverse Number: "+reverseNumber(num));

    }
}
