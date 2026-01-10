package Practice;

import java.util.Scanner;
import java.util.stream.Stream;

//105 -> 501
/*
105%10 = 5
10%10 = 0 => 5 0
1%10 = 1 => 5 0 1
 */
public class P30_ReverseNumber {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int revnumber=0;
        while(num!=0)
        {
            revnumber = (revnumber*10)+(num%10);
            num = num/10;

        }
        System.out.println(revnumber);


        scanner.close();
    }
}
