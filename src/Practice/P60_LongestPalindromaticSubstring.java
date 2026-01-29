package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class P60_LongestPalindromaticSubstring {

    public static void main(String[] args) {
        String str = "babad";
        String subs, lsubs;
        int maxLen = 0;
        Set<Character> hashSet = new LinkedHashSet<>();
        Map<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int p=0;
            while(hashSet.contains(ch))
            {

                hashSet.remove(str.charAt(p));
                p++;
            }
            hashSet.add(ch);

           subs = hashSet.stream().map(String::valueOf).collect(Collectors.joining());
           hashMap.put(subs,subs.length());
        }

    int maxValue = Collections.max(hashMap.values());

        for(Map.Entry<String,Integer> entry: hashMap.entrySet())
        {
            if(entry.getValue()==maxValue)
                System.out.println(entry.getKey());
        }
    }
}
