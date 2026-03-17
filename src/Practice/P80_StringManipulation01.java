package Practice;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P80_StringManipulation01 {
    public static void main() {
        String input = "a1zb12c3b4a2";
        HashMap<Character,Integer> hashMap = new HashMap<>();

      for(int i=0;i<input.length()-1;)
      {
          StringBuilder val = new StringBuilder();
          char ch = input.charAt(i);
          if(Character.isLetter(ch))
          {
                i++;
          }

          while(i<input.length() && Character.isDigit(input.charAt(i)))
          {
            val.append(input.charAt(i));
            i++;
          }

          int value = (!val.isEmpty())? Integer.parseInt(val.toString()): 0;
          hashMap.put(ch, hashMap.getOrDefault(ch,0)+value);
      }

        System.out.println(hashMap);
    }
}
