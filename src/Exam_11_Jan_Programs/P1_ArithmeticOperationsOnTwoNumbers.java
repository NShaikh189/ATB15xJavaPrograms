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

    static int remainder(int a, int b)
    {
        return (a%b);
    }


    public static void main(String[] args) {
        int result;
        scanner = new Scanner(System.in);

        System.out.println("Enter num1");
        num1 = getInt();

        System.out.println("Enter num2");
        num2 = getInt();

        if(num1<=0 || num2<=0)
        {
            System.out.println("Entered numbers should be greater than 0");
            System.exit(0);
        }
        result = add(num1,num2);
        System.out.println("Addition of "+num1+" and "+num2+" => "+result);

        result = substract(num1,num2);
        System.out.println("Substraction of "+num1+" and "+num2+" => "+result);

        result = multiply(num1,num2);
        System.out.println("Multiplication of "+num1+" and "+num2+" => "+result);

        result = divide(num1,num2);
        System.out.println("Division of "+num1+" and "+num2+" => "+result);

        result = remainder(num1,num2);
        System.out.println("Remainder of "+num1+" and "+num2+" => "+result);

        scanner.close();
    }
}
