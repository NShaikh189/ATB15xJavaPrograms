package Practice;

import java.util.Scanner;

//1+2+3 => 3+sum(2) => 3+2+sum(1)
public class P07_SumOfNaturalNumbers {

    static int sumRecursion(int n)
    {
        if(n==1)
            return 1;

        return n+sumRecursion(n-1);
    }

    static int sumFormula(int n)
    {
        return (n*(n+1))/2;
    }
    public static void main() {
        //Sum of 'n' natural numbers formula: sum = n(n+1)/2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to calculate the sum of natural numbers");

        int n= scanner.nextInt();
        if(n>0)
        {
        System.out.println("Recursion method : "+sumRecursion(n));
        System.out.println("Sum using Formula: "+sumFormula(n));
        }
        else
            System.out.println("Enter number greater than 0.");
    }
}
