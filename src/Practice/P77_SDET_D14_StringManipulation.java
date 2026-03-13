package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//rvi Kumar 24
public class P77_SDET_D14_StringManipulation {
    public static void main() {
        String str = "r@56vi Ku$%mar67";

//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
//        Matcher matcher = pattern.matcher(str);
        char[] carr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int sum=0;
        for(char ch: carr)
        {
           if(Character.isLetter(ch)||ch==' ')
            sb.append(ch);
          else if(Character.isDigit(ch))
              sum+=Character.getNumericValue(ch);

        }
        sb.append(' ').append(sum);
        System.out.println(sb.toString());

    }
}
