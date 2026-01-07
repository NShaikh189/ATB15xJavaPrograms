package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P22_LargestOfTwoNumbers {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = scanner.nextInt();

        System.out.println("Largest number: "+((num1>num2)?num1:num2));

        System.out.println(Math.max(num1,num2));

        scanner.close();

    }
}
