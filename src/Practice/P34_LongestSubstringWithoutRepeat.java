package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class P34_LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        Set<Character> set = new LinkedHashSet<>();
        int p1=0;
        int maxLen = 0;
        //StringBuilder result = new StringBuilder();
        String result="";
        for(int i=0; i< str.length();i++)
        {
            char ch = str.charAt(i);

            while(set.contains(ch))
            {
                set.remove(str.charAt(p1));
                p1++;
            }

            set.add(ch);

            if(set.size()>maxLen)
            {
                maxLen = set.size();
                result = set.stream()
                        .map(String::valueOf)
                        .reduce("",String::concat);
            }
        }
//        for(Character c: set)
//        {
//            result.append(c);
//        }
       System.out.println(result);
        scanner.close();
    }
}
