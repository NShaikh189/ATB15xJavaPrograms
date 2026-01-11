package Exam_11_Jan_Programs;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class P4_MaximumOfTwoNumbers {
 static Scanner scanner;
    static int getInt()
    {
        while(true) {
            if (scanner.hasNextInt())
                return scanner.nextInt();
            else {
                System.out.println("Invalid number. Enter a Valid number");
                scanner.next();
                continue;

            }
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a,b;
        a = getInt();

        System.out.print("Enter second number: ");
        b = getInt();

        System.out.println("Maximum of the two numbers : "+Math.max(a,b));
    }
}
