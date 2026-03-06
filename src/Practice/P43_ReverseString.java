package Practice;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P43_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       // String temp="";
            getReverseArray(str);
           getReverseStream(str);



    }

    public static void getReverseArray(String str)
    {
        char[] chArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--)
        {
            //str+=str.charAt(i);
            sb.append(str.charAt(i));
          //  System.out.print(str.charAt(i));
        }

        System.out.println(sb);
    }
    public static void getReverseStream(String str)
    {

       String revString =  IntStream.range(0,str.length())
                .mapToObj(x->str.charAt(str.length()-1-x))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(revString);
    }
}
