package Practice;

import java.util.Scanner;

public class P35_Armstrong3digitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit number");
        int num = scanner.nextInt();
        if(checkArmstrong(num))
            System.out.println("Number is a Armstrong number.");
        else
            System.out.println("Number is not a Armstrong number.");
        scanner.close();
    }

    private static boolean checkArmstrong(int num) {
    boolean flag = false;
    int sum=0;
    int number = num;
    if(num>99)
    {
        while(num!=0)
        {
            int r = num%10;
            sum+=r*r*r;
            num = num/10;
        }

        if(number==sum)
            flag= true;

     }
    else
    {
        System.out.println("Entered number is not a 3 digit number");
        System.exit(0);
    }

    return flag;
    }
}
