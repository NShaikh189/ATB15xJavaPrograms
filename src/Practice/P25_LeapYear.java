package Practice;

import java.util.Scanner;

public class P25_LeapYear {
    public static void main() {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(result?"Leap Year":"Not a Leap Year");
        scanner.close();
    }
}
