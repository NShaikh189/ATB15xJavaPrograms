package Practice;

import java.util.Scanner;

public class P47_ReverseNumberRecursion {

    static int reverseNumber(int num, int revnum)
    {
       if(num==0)
           return revnum;

        return reverseNumber(num/10, revnum*10 + num%10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rnum = reverseNumber(num,0);
        System.out.println(rnum);
    }
}
