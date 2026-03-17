package Practice;

import javax.print.DocFlavor;
import java.util.Arrays;

public class P81_ReverseWordsInAString {

    public static void main() {
        String input = "Java Home! Welcome to SDET"; //o/P: avaJ emoH

     //  reverseString(input);
       reverseStringTwoPtr(input);
    }
    public static void reverseStringTwoPtr(String input)
    {
        String sarr[] = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s: sarr) {
            int left = 0;
            int right = s.length()-1;

            char c[] = s.toCharArray();
            while (left<right)
            {
                char temp = s.charAt(left);
                c[left] = s.charAt(right);
                c[right] = temp;
                left++;
                right--;
            }

            sb.append(new String(c)).append(" ");


        }
        System.out.println(sb.toString().trim());
    }
    public static void reverseString(String input)
    {
        String str[] = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s: str)
        {
            for(int i=0; i<s.length();i++)
            {
                sb.append(s.charAt(s.length()-1-i));
            }
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
