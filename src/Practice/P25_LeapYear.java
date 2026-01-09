package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P25_LeapYear {
    public static void main() {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(result?"Leap Year":"Not a Leap Year");


        System.out.println("Leap Year using streams");
        boolean res = IntStream.of(year).anyMatch(y -> (y%4==0 && y%100!=0)|| y%400==0);
        System.out.println((res)?"Leap Year":"Not Year");

        List<Integer> yList = Arrays.asList(1900,1904,2020,2025);
        yList.stream().filter(y ->
                (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                        .forEach(y->System.out.println("Leap Year: "+y));
        scanner.close();
    }
}
