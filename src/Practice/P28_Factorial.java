package Practice;

import java.util.Scanner;

//0! = 1
//1! = 1
//n! = n(n-1)(n-2)....1
public class P28_Factorial {
    public static void main() {
        System.out.println("Enter the number to find the factorial of ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long fact=1;
        System.out.print("Factorial of a number: "+num+" is :");
        if(num>1 && num<=20)
        {
            for(int i=1;i<=num;i++)
                fact *= i;
            System.out.println(fact);
        }
        else if(num>20)
            System.out.println("Factorial is too large for the entered value");
        else
            System.out.println(fact);

        scanner.close();
    }
}
