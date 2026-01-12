package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class P34_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        Set<Character> set = new HashSet<>();
        int p1=0;
        for(int i=0; i< str.length();i++)
        {
            char ch = str.charAt(i);

            if(!set.contains(ch))
            {
                set.add(ch);
            }
            else
            {
                while(set.contains(ch))
                {
                    set.remove(str.charAt(p1));
                    p1++;
                }
                set.add(ch);
            }
        }
        String result = "";
        for(Character iterator: set)
        {
            result = result+iterator;
        }
        System.out.println(result);
        scanner.close();
    }
}
