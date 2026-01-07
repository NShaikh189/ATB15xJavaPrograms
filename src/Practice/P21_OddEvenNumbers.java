package Practice;

import java.util.Random;

public class P21_OddEvenNumbers {

    public static void main() {
        Random randomNumber = new Random();

        int num = randomNumber.nextInt(1,999);

        String result = (num%2==0)? "Even":"Odd";
        System.out.println("Number: "+num+" is "+result+" number");
    }
}
