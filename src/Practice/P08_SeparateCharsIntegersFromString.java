package Practice;

import java.util.ArrayList;
import java.util.List;

public class P08_SeparateCharsIntegersFromString {
    public static void main() {
        String str = "Pr0gramm1ng";
        List<Integer> integerList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]))
                integerList.add(Character.getNumericValue(ch[i]));
//                        .valueOf((int) ch[i]));
            else {
                characterList.add(ch[i]);
                }
        }

        System.out.println("Integer List" + integerList);

        System.out.println("Character List" + characterList);

    }
}
