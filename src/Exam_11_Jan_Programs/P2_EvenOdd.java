package Exam_11_Jan_Programs;

import java.util.Random;
import java.util.Scanner;

public class P2_EvenOdd {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check if it is Odd or Even");
        int num = scanner.nextInt();

        String result = (num%2==0)? "Even":"Odd";
        System.out.println("Number: "+num+" is "+result+" number");

        scanner.close();
    }
}
