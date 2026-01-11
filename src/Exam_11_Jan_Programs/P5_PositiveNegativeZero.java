package Exam_11_Jan_Programs;

import java.util.Scanner;

public class P5_PositiveNegativeZero {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Enter Integer value");
                scanner.next();
                continue;
            }
            else
                break;
        }
            int num = scanner.nextInt();
            if (num > 0)
                System.out.println("Number is positive");
            else if (num < 0)
                System.out.println("Number is negative");
            else
                System.out.println("Number is zero");

    }
}
