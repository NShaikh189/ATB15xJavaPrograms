package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class P57_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "India is my country. I am proud of it rich and varied heritage";
        firstNonRepeatedChar(str);


    }


    private static void firstNonRepeatedChar(String str) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
            else
                System.out.println("None");
        }
    }
}
