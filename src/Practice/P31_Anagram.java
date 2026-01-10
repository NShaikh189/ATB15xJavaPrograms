package Practice;

import java.util.HashMap;

/*
String "a12b2c4b3a2
O/p: a14b5c3
 */
public class P31_Anagram {
    public static void main() {
        String str = "a12b2c4b3a2";
        int cnt=0;
        //int val=0;
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<str.length();)
        {
            StringBuilder val = new StringBuilder();
            char ch = str.charAt(i);

           if(Character.isLetter(ch))
           {
               i++;
           }
           //char ch1 = ;
            while(i<str.length() && Character.isDigit(str.charAt(i)))
            {
                char ch1 = str.charAt(i);
                val.append(ch1);
                i++;
            }
            if(!hashmap.containsKey(ch))
            {
                hashmap.put(ch,Integer.parseInt(String.valueOf(val)));
            }
            else
            {
                hashmap.put(ch,hashmap.getOrDefault(ch,0)+Integer.parseInt(String.valueOf(val)));
            }
            System.out.println(hashmap.toString());

        }
        StringBuilder result = new StringBuilder();
        hashmap.forEach((k,v)->result.append(k).append(v));
        System.out.println(result);
    }

}
