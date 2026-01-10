package Practice;

import java.util.HashMap;

/*
String "a12b2c4b3a2
O/p: a14b5c3
 */
public class P31_Anagram {
    public static void main() {
        String str = "av12b2c4b3a2";

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

            int value = (val.length()>0)? (Integer.parseInt(String.valueOf(val))) : 0;
            hashmap.put(ch,hashmap.getOrDefault(ch,0)+value);

        }
        StringBuilder result = new StringBuilder();
        hashmap.forEach((k,v)->result.append(k).append(v));
        System.out.println(result);
    }

}
