package Practice;

import java.util.Scanner;

public class P48_FibonacciSeriesRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Fibonacci Series for "+num);
        for(int i=0; i<num;i++)
            System.out.print(fibSeries(i)+", ");
        scanner.close();
    }

    static int fibSeries(int num)
    {
        if(num==0)
            return 0;

        if(num==1)
            return 1;

        return fibSeries(num-1)+fibSeries(num-2);

    }
}
