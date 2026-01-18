package Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P45_CharCountStreams {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        long count =
                str.chars().filter(ch-> ch!=' ').count() ;

        System.out.println("Character count in string "+count);
        scanner.close();
    }
}
