package Exam_11_Jan_Programs;

import java.util.Scanner;

/*
Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.


 */
public class P7_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        do {
            System.out.println("Enter the choice to perform the Operation");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter 1st number");
                    a = scanner.nextInt();

                    System.out.println("Enter 2nd number");
                    b = scanner.nextInt();
                    System.out.println(a+b);
                    break;

                case 2:
                    System.out.println("Enter 1st number");
                    a = scanner.nextInt();

                    System.out.println("Enter 2nd number");
                    b = scanner.nextInt();

                    System.out.println(a-b);
                    break;

                case 3:
                    System.out.println("Enter 1st number");
                    a = scanner.nextInt();

                    System.out.println("Enter 2nd number");
                    b = scanner.nextInt();

                    System.out.println(a*b);
                    break;

                case 4:
                    System.out.println("Enter 1st number");
                    a = scanner.nextInt();

                    System.out.println("Enter 2nd number");
                    b = scanner.nextInt();

                    if(a>b && a!=0 && b!=0)
                    System.out.println(a/b);
                    else
                        System.out.println("Enter number greater than 0");
                    break;

                case 5:
                    System.out.println("Thank You for using Calculator");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Operation terminated");
                    break;
            }
        }while(true);
       // scanner.close();
    }
}
