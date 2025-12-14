package Practice;

import java.sql.SQLOutput;

public class P01_Swap_numbers
{


    public static void swapNumber(int a, int b)
    {
        int ax = a;
        int by=b;

        ax=ax+by;
        by = ax-by;
        ax=ax-by;

        System.out.println("After swap"+ax+","+by);


    }

    public static void main(String args[])
    {
        int a=5;
        int b=4;

        Integer x=(Integer)a;
        System.out.println(x);
        System.out.println("Before swap"+a+","+b);
    swapNumber(a,b);
    }
}
