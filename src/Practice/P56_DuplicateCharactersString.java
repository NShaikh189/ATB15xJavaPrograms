package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class P56_DuplicateCharactersString {

    public static void main(String[] args) {

            String str = "India is my country. I am proud of it rich and varied heritage";

            Set<Character> hashSet = new LinkedHashSet<>();

            str.chars().mapToObj(ch->(char)ch).forEach(ch->hashSet.add(ch));
            StringBuilder sb = new StringBuilder();
            for(Character c:hashSet)
                sb.append(c);

        System.out.println(sb.toString());
    }
}
