package Practice;

import java.util.Scanner;

public class P26_SwapTwoNumbesWithoutThirdVar {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();//5

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();//3

        num1 = num1+num2;//8 , 3
        num2 = num1-num2; // 8 , 5
        num1 = num1-num2; //3, 5

        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
    }
}
