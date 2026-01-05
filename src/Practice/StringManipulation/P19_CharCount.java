package Practice.StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P19_CharCount {
    public static void main() {
        String str = "India is my country. All indians are my brothers and sisters";

        Map<Character,Long> charMap = new HashMap<>();

        charMap = str.chars()
                .mapToObj(ch -> (char)ch)
                //.filter(Character::isLetterOrDigit)
                .filter(ch-> Character.isLetterOrDigit(ch))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(charMap);

        int maxValue=0;
        char maxCh=' ';
        for(Map.Entry<Character,Long> entry: charMap.entrySet())
        {
            if(entry.getValue()>maxValue) {
                maxValue = Integer.parseInt(entry.getValue().toString());
                maxCh = entry.getKey();
             //   System.out.println(maxValue);
            }
        }

        System.out.println(maxCh+" : "+maxValue);

        Map<Character,Integer> characterIntegerMap = new HashMap<>();
        for(char ch: str.toCharArray())
        {
            if(Character.isDigit(ch)||Character.isAlphabetic(ch)) //||Character.isLetterOrDigit(ch))
            characterIntegerMap.put(ch, characterIntegerMap.getOrDefault(ch,0)+1);
        }
        System.out.println(characterIntegerMap);


    }
}
