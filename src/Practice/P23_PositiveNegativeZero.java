package Practice;

import java.util.Scanner;

public class P23_PositiveNegativeZero {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter value");
            if (!scanner.hasNextInt()) {
                System.out.println("Enter Integer value");
                scanner.next();
                continue;
            }
            int num = scanner.nextInt();
            if (num > 0)
            {
                System.out.println("Number is positive");
            break;
            }
            else if (num < 0)
            {
                System.out.println("Number is negative");
                break;
            }else {
                System.out.println("Number is zero");
                break;
            }
        }
    }
}
