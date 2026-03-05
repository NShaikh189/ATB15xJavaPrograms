package Practice;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P43_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       // String temp="";
            getReverse(str);
        char[] ch = str.toCharArray();

        if(str.length()>1)
        {
            str = "";
            for(int i= ch.length-1; i>=0; i--)
                str += ch[i];
        }

        System.out.println("Reverse String : "+str);


    }

    public static void getReverse(String str)
    {
        String reverseString = IntStream.range(0, str.length()-1)
                .mapToObj(i->str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reverseString);
    }
}
