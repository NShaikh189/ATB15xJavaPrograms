package Practice;

import java.util.Scanner;
//num =5
//fnum = 0,1,1,2,3,5
public class P29_FibonacciSeries {
    public static void main() {
        System.out.println("Enter the number to find the fibonacci series");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a=0;
        int b=1;
        int fib=0;
        if(num<1)
        {
            System.out.println("Invalid number");
            System.exit(0);
        }
        if(num>=1) {
            System.out.print(a+" ");
        }
        if(num>=2)
            System.out.print(b+" ");

        for (int i = 3; i <= num; i++) {
                fib = a + b;
                a = b;
                b = fib;
                System.out.print(fib+" ");
            }

    }
}
