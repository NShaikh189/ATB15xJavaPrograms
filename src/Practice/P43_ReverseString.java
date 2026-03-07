package Practice;

import java.util.Arrays;
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
           String revstring2PR = getReverseTwoPtr(str);

      if(revstring2PR.equals(str))
          System.out.println("String is a Palindrome");
      else System.out.println("Not a Palindrome");

    }

    private static String getReverseTwoPtr(String str) {

        int left = 0;
        int right = str.length()-1;
        char temp;
        char ca[] = str.toCharArray();
        StringBuilder s = new StringBuilder();
        while(left<right)
        {
            temp = ca[left];
            ca[left] = ca[right];
            ca[right] = temp;
            left++;
            right--;
        }

        for(char c: ca)
            s.append(c);
        System.out.println("Two Point approach"+Arrays.toString(ca));
        System.out.println(s);

        return s.toString();
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
