package ex_11_WhileLoop;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Lab_016_NumberGuessing {

    public static void main() {
        Random random = new Random();
        int rnum = random.nextInt(1,100);

       int attempts=0;
       int unum;
        Scanner scanner = new Scanner(System.in);
       while(true)
       {
           System.out.println("Enter the number");
           if(!scanner.hasNextInt()) {
                   System.out.println("Enter int value only");
                   scanner.next();
                   continue;
           }
               attempts++;
               unum = scanner.nextInt();
               if(unum<rnum)
               {
                   System.out.println("Too Low. try again");
               }
               else if(unum>rnum)
               {
                   System.out.println("Too High. try again");
               }
               else {
                   System.out.println("Number matched");
                   break;
               }
           }


       System.out.println("Match found in "+attempts+" attempt");
    }
}
