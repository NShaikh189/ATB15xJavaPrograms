package Practice.StringManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class P17_StringUpperCaseStreams {
    public static void main() {
        String str = "india is my country !";
        System.out.println(str);
       String newStr = Arrays.stream(str.split(" "))
               .map(s->s.substring(0,1).toUpperCase().concat(s.substring(1))+" ")
               .collect(Collectors.joining());
        System.out.println(newStr);
    }
}
