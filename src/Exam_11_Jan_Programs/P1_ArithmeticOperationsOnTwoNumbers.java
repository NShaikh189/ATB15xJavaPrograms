package Exam_11_Jan_Programs;

import java.util.Scanner;

/*
1) Arithmetic Operations on Two Numbers

Description:
Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
 */
public class P1_ArithmeticOperationsOnTwoNumbers {
    static Scanner scanner;
    static int num1, num2;

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

   static int add(int a, int b)
   {
       return (a+b);
   }

    static int substract(int a, int b)
    {
        return (a-b);
    }

    static int multiply(int a, int b)
    {
        return (a*b);
    }

    static int divide(int a, int b)
    {

        return (a/b);
    }


    public static void main(String[] args) {
        System.out.println("Enter num1");
        int result;
        scanner = new Scanner(System.in);
        num1 = getInt();

        System.out.println("Enter num2");
        num2 = getInt();

        result = add(num1,num2);
        System.out.println("Addition of "+num1+" and "+num2+" => "+result);

        result = substract(num1,num2);
        System.out.println("Substraction of "+num1+" and "+num2+" => "+result);


        scanner.close();
    }
}
