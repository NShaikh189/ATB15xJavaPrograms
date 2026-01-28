package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class P34_LongestSubstringWithoutRepeat {

    static void longestSubStringWithNoRepeat(String str)
    {
        Set<Character> subs = new LinkedHashSet<>();
        int p=0;
        int maxLen=0;
        String sb="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
         if(subs.contains(ch))
         {
             while(subs.contains(ch))
             {
                 subs.remove(str.charAt(p));
                 p++;
             }

         }

             subs.add(ch);
            if(maxLen<subs.size())
            {
                maxLen=subs.size();
                sb=subs.stream().map(String::valueOf).collect(Collectors.joining());

            }

        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        longestSubStringWithNoRepeat("abcabcbb");
//        Scanner scanner = new Scanner(System.in);
//
//        String str = scanner.next();
//
//        Set<Character> set = new LinkedHashSet<>();
//        int p1=0;
//        int maxLen = 0;
//        //StringBuilder result = new StringBuilder();
//        String result="";
//        for(int i=0; i< str.length();i++)
//        {
//            char ch = str.charAt(i);
//
//            while(set.contains(ch))
//            {
//                set.remove(str.charAt(p1));
//                p1++;
//            }
//
//            set.add(ch);
//
//            if(set.size()>maxLen)
//            {
//                maxLen = set.size();
//                result = set.stream()
//                        .map(String::valueOf)
//                        .reduce("",String::concat);
//            }
//        }
////        for(Character c: set)
////        {
////            result.append(c);
////        }
//       System.out.println(result);
//        scanner.close();
   }
}
