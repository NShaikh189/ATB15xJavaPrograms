package Practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P67_StringtoCharacters {
    public static void main(String[] args) {
        List<String> stringList = List.of("India", "Australia");

       List<Character> chList =  stringList.stream().
               flatMap(
                       s->s.chars().mapToObj(ch->(char)ch)
               )
               .toList();


        System.out.println(chList);
    }
}
