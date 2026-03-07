package Practice;

import java.util.stream.Collectors;

public class LC125_ValidPalindrom {

    public static void main() {
        String str = "race@ a :car";

       String s = str.chars().mapToObj(c->(char)c)
               .filter(Character::isLetterOrDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(s);

        StringBuilder sb = new StringBuilder(s);
        String rString = sb.reverse().toString();


        System.out.println(rString);
        if(s.equalsIgnoreCase(rString))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
