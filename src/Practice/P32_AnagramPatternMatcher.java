package Practice;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P32_AnagramPatternMatcher {
    public static void main() {
        String str = "av12b2c4b3a2";

        Pattern pattern = Pattern.compile("([a-zA-Z])(\\d+)");
        Matcher matcher = pattern.matcher(str);
        HashMap<Character,Integer> hashMap = new HashMap<>();
        while(matcher.find())
        {
            char ch = matcher.group(1).charAt(0);
            int num = Integer.parseInt(matcher.group(2));
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+num);

        }
        StringBuilder result = new StringBuilder();
        hashMap.forEach((k,v)->result.append(k).append(String.valueOf(v)));
        System.out.println(result);
    }
}
